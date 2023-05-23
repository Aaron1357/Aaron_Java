package com.kh.step1.model;


public class Tv {
//  ------속성(멤버변수,특성,필드)----------
	
	public boolean power; // 전원상태
	public int channel; // 채널
	


//	------기능(메서드)----------
	
	public void power() {
		power = !power;
	} // Tv를 켜거나 끄는 기능

	public void channelUp() {
		++channel;
	} // Tv 채널을 높이는 기능

	public void channelDown() {
		--channel;
	} // Tv 채널을 낮추는 기능

}