package com.emrc_transport;

import java.io.*;

public class MainSocketOutput extends Thread {
	private String msg;

	public MainSocketOutput(String msg) {
		this.msg = msg;
	}

	public void run() {
		try {
			PrintWriter out = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(new DataOutputStream(MainActivity.skt.getOutputStream()), "UTF-8")),
					true);
			out.println(msg);
			out.flush();
		} catch (IOException e) {
		}
	}
}
