package com.kh.step6;

public class CgvUser implements Runnable {

	private boolean seat = false;
	//좌석 예매가 끝나면 True
	@Override
	public void run() {
		
		try {
			reserve();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public synchronized void reserve() throws InterruptedException {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + "님, 예매하러 오셨습니다...");
		
		if(seat == false) {
			Thread.sleep(2000);
		System.out.println(name + "님, 좌석이 예매 되었습니다.");
		seat = true;
		}else System.out.println(name + "님 자리는 없습니다 ");
	} 
	
}
