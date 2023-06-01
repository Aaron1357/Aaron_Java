package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen {

	String name = "S23 Ultra";
    String brand = "삼성";
	@Override
	public boolean pen() {
		return true;
		
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
		
	}
	@Override
	public String takeCall() {
	
		return "수신버튼을 누름";
		
	}
	@Override
	public String picture() {
		return "2억 화소카메라" ;
		
	}
	public S23Ultra() {
	}
	public void printInformation() {
         System.out.println("스마트폰 명 : " + this.name +  "\n전화걸기 : " + makeCall() + "\n전화받기 : " + takeCall() + "\n촬영방식 : " + picture() + "\n펜 탑재여부 : " + pen()); 
		
	}	
}
