package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.*;

public class Run {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

          SnackController sn1 = new SnackController();
          
		System.out.println("스낵류를 입력하세요");
		System.out.println("종류 :");
		String kind = sc.nextLine();
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("맛 :");
		String flavor = sc.nextLine();
		System.out.println("개수 :");
	    int numOf = sc.nextInt();
		System.out.println("가격 :");
		int price = sc.nextInt();
		
        Snack s1 = new Snack(kind,name,flavor,numOf,price);// 이해완료 
       
     
       
        
        sn1.saveData(s1);
        if(sn1.saveData(s1)) {
        System.out.println(sn1.confirmData());
		System.out.println("저장 완료 되었습니다");}
        
        
        System.out.println("빵 복사기 가동 갯수입력 :");
        sn1.aditNum(sc.nextInt());
        System.out.println("현재 빵 갯수 :" + s1.getNumOf());
		//System.out.println(sn1.getKind() + " ( " + sn1.getName() + " - " + sn1.getFlavor() + " ) " + sn1.getNumOf()
			//	+ "개 " + sn1.getPrice() + "원");

	}
}
