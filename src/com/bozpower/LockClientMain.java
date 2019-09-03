package com.bozpower;


import com.bozpower.socket.LockClientThread;
import com.bozpower.util.Utils;

public class LockClientMain {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i ++) {
//			new LockClientSocket(Utils.port, "客户端" + i, (byte) i).start();
			new LockClientThread(Utils.port, "客户端" + i, (byte) i).start();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
