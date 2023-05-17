package com.kh.Operator;

import javax.sql.rowset.serial.SQLOutputImpl;

public class A_LogicalNegation {
	
public static void main(String[] args) {
	

	
	// $논리 부정 연산자$
	// !논리걊(true,false)
	// ! = 논리 값을 반대로 바꾸는 연산자
	
	 boolean b1 = true;
	 boolean b2 = false;
	 
     System.out.println("b1 : " + b1);
     System.out.println("b1의 부정 " + !b1);
     System.out.println("b1 : " + b1);
	
     b1 = !b2;
     
     System.out.println("b1 : " + !!b1);
}
}