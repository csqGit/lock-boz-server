package com.bozpower.entity;

import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SocketMap {
	
	private static Map<String, Socket> clientSocketMap = new HashMap<String, Socket>();
	
	
	public  Socket getSocketMap(Socket socket) {
		InetAddress addr = socket.getInetAddress();
		String ip = addr.getHostAddress();
		
		return clientSocketMap.get(ip);
	}
	
	public synchronized void setSocketMap( Socket socket) {
		InetAddress addr = socket.getInetAddress();
		String ip = addr.getHostAddress();
		clientSocketMap.put(ip, socket);
		System.out.println("设备连接数量：" + size());
		Set<Entry<String, Socket>> set = clientSocketMap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			System.out.println(key + "--->" + clientSocketMap.get(key));
		}
	}
	
	public int size() {
		
		return clientSocketMap.size();
	}
	
	

}
