package com.gmail.model;

import java.util.Date;

public class Mail {
	
// -----------속성---------
	
	public String sendAdress; //보내는사람 메일
	public String reAdress;  //받는사람 메일
    public boolean reservation; //보내는 날짜 예약 기능
    public Date rvDate; // 예약메일 날짜지정
    
     
    
 //----------기능---------
    
    public void sendMail() {     //메일보내기
	}

	public void viewMail() {  //메일보기
	}

	public void reWrite() {  //메일수정
	}

	public void deleteMail() { //메일삭제
	}

}