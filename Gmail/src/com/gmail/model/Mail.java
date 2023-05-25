package com.gmail.model;

import java.util.Date;

public class Mail {
	
// -----------속성---------
	
	public String sendAdress; //보내는사람 메일
	public String reAdress;  //받는사람 메일
    public boolean reservation; //보내는 날짜 예약 기능
    public Date rvDate; // 예약메일 날짜지정
	
    
    public Mail() {
	}


	public Mail(String sendAdress, String reAdress, boolean reservation, Date rvDate) {
		this.sendAdress = sendAdress;
		this.reAdress = reAdress;
		this.reservation = reservation;
		this.rvDate = rvDate;
	}


	public String getSendAdress() {
		return sendAdress;
	}


	public void setSendAdress(String sendAdress) {
		this.sendAdress = sendAdress;
	}


	public String getReAdress() {
		return reAdress;
	}


	public void setReAdress(String reAdress) {
		this.reAdress = reAdress;
	}


	public boolean isReservation() {
		return reservation;
	}


	public void setReservation(boolean reservation) {
		this.reservation = reservation;
	}


	public Date getRvDate() {
		return rvDate;
	}


	public void setRvDate(Date rvDate) {
		this.rvDate = rvDate;
	}


	@Override
	public String toString() {
		return "Mail [sendAdress=" + sendAdress + ", reAdress=" + reAdress + ", reservation=" + reservation
				+ ", rvDate=" + rvDate + "]";
	}
    
     
    


}