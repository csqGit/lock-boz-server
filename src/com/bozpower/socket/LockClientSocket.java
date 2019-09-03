package com.bozpower.socket;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.bozpower.entity.SocketMap;

/**
 * 客户端
 * 
 * @author bozpower
 *
 */
public class LockClientSocket{
	private Socket socket;
	

	private byte[] b = { 0 };

	InputStream inputStream = null;
	InputStreamReader reader = null;
	OutputStream outputStream = null;
	OutputStreamWriter os = null;

	public LockClientSocket() {

	}

	public LockClientSocket(int port, String name, byte speak) {
		try {
			socket = new Socket("127.0.0.1", port);
			System.out.println("客户端与服务器建立连接！！！！");

			connect();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


	public void connect() {

		try {
			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();
			while (true) {
				if(!socket.isClosed()) {
					System.out.println();
					outputStream.write(b);
					
					byte[] readByte = new byte[1024];
					int len = inputStream.read(readByte);
					
					System.out.println("客户端收到数据S：" + Integer.valueOf(readByte[0]));
					Thread.sleep(5000);
				}else {
					System.out.println("服务器已关闭");
					throw new SocketException();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
