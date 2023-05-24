package com.kh.step3.model;

import java.util.*;
// 메서드
//	  
//	작업을 수행하기 위한 명령문의 집합
//	어떤 값을 입력받아서 처리하고 그 결과를 돌려준다
//	단, 입력받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있다.
//  하나의 메서드는 한가지의 기능만 수행하도록 작성하는 것을 권고

//    리턴타입 메서드이름 (타입 변수명, 타입1 변수명1..) {

//    	 리턴 : 메서드 내에서 리턴문을 만나면 메서드는 종료
//       반환값이 없는 void 메서드의 경우 return만 사용
//         반환값이 있는 경우 return 뒤에 반환값을 지정해야한다.
//          
//                return; 

//    } 

public class Calculator {

	static Scanner sc = new Scanner(System.in);

	public static int a1 = sc.nextInt();
	public static int a2 = sc.nextInt();

	public int max(int a, int b) {// 여기에 int a,b는 지역변수 {
		int c = (a > b) ? a : b;
		return c;
	}

	public int add1(int a, int b) {

		return a + b;
	}

	public static int substract(int a, int b) {

		return a - b;
	}

	public static int multiply(int a, int b) {

		return a1 * a2;

	} // 나누기 몫1 나머지3

	public static String divide(int a, int b) {

		return ("몫은" + a1 / a2);

	}

	public static String remainder(int a, int b) {

		return ("나머지는" + a1 % a2);

	} // 나누기 몫1 나머지3// 나누기 몫1 나머지3

	public int factorial(int a) {
		int fac = 1;
		for (int i = 1; i <= a; i++) {
			fac *= i; 
		}
		return fac;
	}

}
