package com.bozpower;


import java.util.ArrayList;
import java.util.List;

import com.bozpower.entity.Lockinfo;
import com.bozpower.socket.LockServerSocket;
import com.bozpower.util.Jdbc;
import com.bozpower.util.Utils;

public class LockServerMain {
	public static List<Lockinfo> lockList = new ArrayList<Lockinfo>();//存放设备信息
	public static void main(String[] args) {
		//查询数据库，保存所有的设备信息到缓存
		Jdbc jdbc = new Jdbc();
		//向集合中添加所有的锁设备
		jdbc.selectLockList();
		
		LockServerSocket lockServerSocket = new LockServerSocket(Utils.port);
		lockServerSocket.lockServer();
		
	}

}
