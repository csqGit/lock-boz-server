package com.bozpower.socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Timer;

import com.bozpower.entity.SocketMap;

public class LockServerSocket {
	private int port;
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private SocketMap socketMap = new SocketMap();
	
	
	public LockServerSocket() {}
	public LockServerSocket(int port) {
		this.port = port;
	}
	
	public void lockServer() {
		try {
			serverSocket = new ServerSocket(port);
			
			while(true) {
				System.out.println("等待客户端连接。。。");
				//等待设备于服务器建立连接
				socket = serverSocket.accept();
				System.out.println("客户端已连接");
				//启动线程，处理业务
				socketMap.setSocketMap(socket);
				Timer timer = new Timer();
				timer.schedule(new MyTask(socket), 0, 10000);
//				new LockServerThread(socket).start();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
