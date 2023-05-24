package com.kh.step3;

import com.kh.step3.model.*;

public class Application {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		// 변수 호출 방법
//		인스턴스변수 :( 참조 후 )참조변수.변수; 
//		클래스변수 :         클래스.변수; 

		// 메서드 호출 방법
//		인스턴스 메소드 :( 참조 후 )참조변수 .메소드; 
//		클래스 메소드 :         클래스.메소드; 

//		System.out.println(c1.max(6, 3));
//		System.out.println(c1.add1(6, 3));
//		System.out.println(Calculator.substract(Calculator.a1, Calculator.a2));
//		System.out.println(Calculator.multiply(Calculator.a1, Calculator.a2));
//		System.out.println(Calculator.divide(Calculator.a1, Calculator.a2));
//		System.out.println(Calculator.remainder(Calculator.a1, Calculator.a2));
        System.out.println(c1.factorial(6));
		
	}
}
