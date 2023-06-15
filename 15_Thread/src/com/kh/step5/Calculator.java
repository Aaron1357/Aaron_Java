package com.kh.step5;

import java.util.concurrent.SynchronousQueue;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	/*
	 * 동기화 ( Synchronized )
	 * 
	 * 스레드가 사용 중인 객체의 작업이 끝날 때 까지 사용 중인 객체에 잠금을 걸어서 다른 스레드의 접근을 막는것
	 * 
	 * 
	 */
	public synchronized void setMemory(int memory) {

		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
