package com.data;

public class Daemon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subscriber client = new Subscriber();

        client.start();

        while (true) {}
	}

}
