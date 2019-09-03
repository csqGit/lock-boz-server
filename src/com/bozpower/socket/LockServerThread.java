package com.bozpower.socket;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;

import com.bozpower.util.Jdbc;

/**
 * 开启线程，处理设备
 * @author bozpower
 *
 */
public class LockServerThread extends Thread{
	
	private Socket socket;
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	InputStream inputStream = null;
	InputStreamReader reader = null;
	OutputStream outputStream = null;
	OutputStreamWriter os = null;
	
	private byte[] b = { 1}; 
	private Jdbc jdbc = new Jdbc();
	
	public LockServerThread() {}
	public LockServerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
				inputStream = socket.getInputStream();
				outputStream = socket.getOutputStream();
				while(true) {
					
					if(!socket.isClosed()) {
						byte[] readByte = new byte[1024];
						int len = inputStream.read(readByte);
						if(len != -1) {
							//读取设备名称
							String deviceId = Integer.valueOf(readByte[0]) + "";
							
						}
						outputStream.write(readByte[0]);
					}else {
						System.out.println("客户端已断开连接");
						throw new SocketException();
					}
					
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
