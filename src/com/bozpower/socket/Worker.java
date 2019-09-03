package com.bozpower.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.bozpower.entity.Pojo;
import com.bozpower.entity.Requestlog;
import com.bozpower.util.Jdbc;

public class Worker {

	private Socket socket;

	private InputStream inputStream = null;
	private InputStreamReader reader = null;
	private OutputStream outputStream = null;
	private OutputStreamWriter os = null;
	private Jdbc jdbc = new Jdbc();

	public Worker() {

	}

	public Worker(Socket socket) {
		this.socket = socket;

		try {
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 向设备发送命令
	 * 
	 * @param did
	 * @return
	 */
	public int sendDeviceData(String did) {
		try {
			// 服务器向设备下发心跳,判断设备与服务器正常连接
			outputStream.write(03);
			byte[] readByte = new byte[10];
			// 读取设备的心跳，如果有心跳，表明设备与服务器正常连接

			// 表示服务器与设备通信正常
//			socket.setSoTimeout(3000);
			int len = inputStream.read(readByte);
//			for(byte b: readByte) {
//				System.out.println(Integer.valueOf(b));
//			}
			if (len > 0) {
				//
				// 判断当前线程为那个设备开启的,下发开锁命令,设备开锁
				String id = Integer.valueOf(readByte[0]).toString() + Integer.valueOf(readByte[1]).toString()
						+ Integer.valueOf(readByte[2]).toString() + "";
				if (!"".equals(did) && did != null && !"".equals(id) && did.equals(id)) {
					outputStream.write(1);
					return 1;
				} else {
					return 0;
				}

			} else {
				// 关闭连接，让设备重新连接
				socket.close();
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public Pojo getLogByDid() {
		Pojo pojo = null;
		try {
			// 服务器向设备下发心跳,判断设备与服务器正常连接
			outputStream.write(03);
			byte[] readByte = new byte[10];
			int len = inputStream.read(readByte);
			// 读取设备的心跳，如果有心跳，表明设备与服务器正常连接
			if (len > 0) {
				// 判断当前线程为那个设备开启的,下发开锁命令,设备开锁
				String did = Integer.valueOf(readByte[0]).toString() + Integer.valueOf(readByte[1]).toString()
						+ Integer.valueOf(readByte[2]).toString() + "";
				pojo = jdbc.getLogList(did);

			} 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return pojo;
	}

}
