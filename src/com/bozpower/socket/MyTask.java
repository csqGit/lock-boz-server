package com.bozpower.socket;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;

import com.bozpower.entity.Pojo;
import com.bozpower.entity.Requestlog;
import com.bozpower.util.Jdbc;

public class MyTask extends TimerTask {

//	private List<Lockinfo> list = LockServerMain.lockList;
	private Jdbc jdbc = new Jdbc();
	private Pojo pojo;
	private static String deviceId;
	
	

	private Socket socket;

	public MyTask() {
	}

	public MyTask(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			//查询出当天的所有请求， 并保存到pojo实体类中
			Worker worker = new Worker(socket);
			pojo = worker.getLogByDid();
//			pojo = jdbc.selectLog();
			Map<Integer, Requestlog> map = pojo.getRequestlogList();
			Set<Integer> entry = map.keySet();
			// 
			System.out.println("\n审核前数量：" + entry.size());
			
			for (Integer id : entry) {
				Requestlog log = map.get(id);
				if (log.getStatus() != 4) {// 表示管理员已审核，但是服务器还没有下发命令给设备
					System.out.println("id:" + log.getId() + ",锁：" + log.getDid() + "等待管理员开锁" + "，锁状态：" + log.getStatus());
					
					if(log.getStatus() != 0) {
						//服务器下发管理员开锁命令  1 同意  2拒绝
						if(log.getStatus() == 1) {//表示管理员同意开锁
							int result = worker.sendDeviceData(log.getDid());
							if(result == 1) {//表示服务器下发开锁命令成功
								System.out.println("【下发开锁命令成功，开锁成功】");
								//删除几何中的数据
								pojo.removeMapById(id);
								//更新数据库的数据，表示服务器已下发命令
								jdbc.sendData(id, 4);
							}else {//表示服务器下发命令失败
								System.out.println("【【下发开锁命令失败】】");
							}
						}else {//表示管理员不同意开锁
							//更新数据库的数据，表示服务器已下发命令
							jdbc.sendData(id, 4);
							System.out.println("【管理员拒绝开锁】");
						}
					}else {
//						System.out.println("等待管理员审核。。。");
					}
				}else {
					System.out.println("表示管理员已将所有信息审核");
				}
			}
			
//			pojo.removeMapByDid(idList);
			System.out.println("\n审核后数量：" + entry.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 审核所有的请求

//		Iterator<Entry<String, Requestlog>> it = entry.iterator();
//		while(it.hasNext()) {
//			
//			
//		}
	}

}
