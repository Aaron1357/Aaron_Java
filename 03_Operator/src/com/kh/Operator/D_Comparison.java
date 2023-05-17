package com.kh.Operator;
import java.util.*;
public class D_Comparison {


	//$비교 연산자$

	 //a < b
	 //a > b
	 //a <= b
	 //a >= b
	 //a == b
	 //a != b
	
	 //조건 만족시 True , 불만족시 False
	
	 
	public static void main(String[] args) {
	
		
		D_Comparison d = new D_Comparison();
		d.method1();
		d.method2();
	

	}
	
	
	
	public void method1() {
		
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b :" + (a == b));
		System.out.println("a <= b :" + (a <= b));
		System.out.println("a >= b :" + (a >= b));
		
		boolean result = (a > b);
		System.out.println("result :" + result);
		
		System.out.println((a * 2) > (b / 5));
		System.out.println("a가 짝수인가? : " + (a % 2 == 0));
		System.out.println("a가 홀수인가? : " + (a % 2 != 0));
		
		
	}
	

public void method2() {
		
		
	Scanner sc = new Scanner(System.in);
	

	System.out.println("첫번째 정수 :");
	int num1 = sc.nextInt();
	
	System.out.println("두번째 정수 :");
	int num2 = sc.nextInt();
	
	System.out.println("첫번째가 두번째 보다 큽니까? :" + (num1 > num2));
	System.out.println("첫번째 정수가 짝수입니까? :" + (num1 % 2 == 0));
	
	System.out.println(num2 > 'A');
	
 	
	
		
	}
	
	
}
