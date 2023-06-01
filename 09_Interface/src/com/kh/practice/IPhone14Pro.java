package com.kh.practice;



public class IPhone14Pro extends SmartPhone implements Pen {

	String name = "iPhone 14 pro";
    String brand = "애플";
	
	public IPhone14Pro() {
	}

	public void printInformation() {
		  System.out.println("스마트폰 명 : " + this.name + "\n전화걸기 : " + makeCall() + "\n전화받기 :" + takeCall() + "\n촬영방식 : " + picture() + "\n펜 탑재여부: " + pen());
	}

	@Override
	public boolean pen() {
		return false;
		
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";

	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "4800만 화소 카메라";

	}
}
