package com.kh.example.practice4;
import java.util.*;
import com.kh.example.practice4.controller.*;
import com.kh.example.practice4.model.*;

import com.kh.example.practice4.controller.SnackController;


public class Run {
	
	 public static void main(String[] args) {
		
	
//--------------------화면---------------------//
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("스낵류를 입력하세요");
	 
	 
	 System.out.println("종류를 입력하세요");
	 String kind = sc.nextLine();
	 System.out.println("이름을입력하세요");
	 String name = sc.nextLine();
	 System.out.println("맛을 입력하세요");
	 String flavor = sc.nextLine();
	 System.out.println("수량 입력하세요");
	 int numOf = Integer.parseInt(sc.nextLine());
	 System.out.println("가격을 입력하세요");
	 int price = Integer.parseInt(sc.nextLine());
	
	 // ---------데이터를 서버한테 요청하는 부분 ----------//
	 
	 SnackController snackControl = new SnackController();
	 Snack tempSnack = new Snack(kind,name,flavor,numOf,price); // << Snack에 생성자로 들어감! 스낵입력값 완성
	 snackControl.saveData(tempSnack);
	 
	 //------서버한테 데이터 결과를 받아서 다시 화면으로 돌아오는 곳-----//
	 System.out.println("저장 완료 되었습니다.");
	 System.out.println(snackControl.confirmData());
	 }	
}
