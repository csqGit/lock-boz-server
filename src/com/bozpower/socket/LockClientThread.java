package com.bozpower.socket;


public class LockClientThread extends Thread{
	private String clientName;
	private byte speak ;
	private int port;

	public LockClientThread(int port, String name, byte speak) {
		this.clientName = name;
		this.speak = speak;
		this.port = port;
	}

	@Override
	public void run() {
		new LockClientSocket(port, clientName, speak);
	}
}
