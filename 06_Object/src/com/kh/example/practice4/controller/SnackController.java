package com.kh.example.practice4.controller;

import java.util.Scanner;

import com.kh.example.practice4.model.*;
//$컨트롤러$

//사용자가 화면에서 요청한 부분을 처리하는 기능 담당/
//이때 처리 후에 결과를 여기서 출력하는게 아니라 결과값을 
//다시 view에 반환하여 view에서 처리하도록 해야 함

public class SnackController {
	private Snack s1 = new Snack();
	
 Scanner sc = new Scanner(System.in);
 
	public SnackController() {}
	
	
		
	
//데이터를 setter를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack sn1) {
		this.s1.setKind(sn1.getKind());
		this.s1.setName(sn1.getName());
		this.s1.setPrice(sn1.getPrice());
		this.s1.setNumOf(sn1.getNumOf());
		this.s1.setFlavor(sn1.getFlavor());
		
		return true;

	}

// 저장된 데이터를 반환하는 메서드

	public Snack confirmData() {
		return this.s1;

	}
	
	public int aditNum(int a) {
		
		 //메서드 
		
		return this.s1.getNumOf() + a;
	   
		
	}
}
