package com.kh.array;

import java.util.*;

public class A_Array {

	Scanner sc = new Scanner(System.in);
//	$ 배 열 $

//	변수 : 하나의 공간에 하나의 값을 담을 수 있음
//	배열 : 하나의 공간에 여러 값을 담을 수 있음
//	같은 자료형의 값만!
//	배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작)
//	
//	배열의 표현법
//	
//	배열명 = new 자료형[배열 크기]
//	자료형[] 배열명 = new 자료형[배열크기]
//	자료형 배열명[] = new 자료형[배열크기

	public static void main(String[] args) {

		A_Array a = new A_Array();
		// a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		a.method5();
		a.method6();
		a.method7();

	}

	public void method1() {

//		배열 변수와 인덱스를 이용해 초기화

		int[] score = new int[5]; // 크기 지정 필수

		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;

		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		System.out.println(score);
//	    기본 자료형은 스택메모리에 생성된 공간에 실제 변수값을 저장하는 반면
//	    참조 자료형은 실제 데이터 값은 힙 메모리에 저장하고,
//	     스택 메모리의 변수 공간에는 실제 변수값이 저장된 힙 메모리의 주소값 저장

//		배열을 생성하고 초기화 해주지 않아도 문제없이 출력!
//		jvm이 지정한 기본값으로 배열이 초기화
//		정수 0 실수 0 논리형 false 참조형 null 문자형 /u0000 
	}

	public void method2() {

//		int[] score = new int[] {100,90,80,70,60}; O

//		int[] score = new int[];
//		{100,90,80,70}       X        초기화 같이 해야댐 

//		문자열 길이 .length(), 배열의 길이 .length
//		반복문을 사용해서!

		int[] score = new int[4];
		for (int i = 0; i < score.length; i++) {

			System.out.println(i);

		}
	}

	public void method3() {

		int[] score = new int[5];
		int num = 100;

		for (int i = 0; i < score.length; i++) {
			score[i] = num;
			num -= 10;

			System.out.println(score[0]);
			System.out.println(score[1]);
			System.out.println(score[2]);
			System.out.println(score[3]);
			System.out.println(score[4]);
		}
//		향상된 for문 
//		자바 5부터 배열 및 컬렉션 클래스를 좀 더 쉽게 처리할 목적으로 제공
//		증감식을 사용않고 배열 및 컬렉션의 요소 개수만큼 반복하고 for문을 종료	

		for (int s : score) {
			System.out.println(s); // 그냥 배열 안에 요소 싹 출력

		}

	}

	public void method4() {

		// 3명의 키를 입력받아 배열에 저장하고 3명의 키의 평균값을 구하세요.
		int a = 0;
		double tall = 0;
		System.out.println("몇명?");
		a = sc.nextInt();
		double[] total = new double[a];
		double result = 0;

		for (int i = 0; i < total.length; i++) {

			System.out.println((i + 1) + " 번째 키를 입력하세요");
			total[i] = sc.nextDouble(); // total 0 입력값 , 1일떄 입력기값

			result += total[i]; // 입력값 저장용

		}
		System.out.printf("평균값은 : %.2f 입니다", result / 3);

	}

	public void method5() {

//		$배열의 복사$

//		얕은 복사 : 배열의 주소만 복사
//		int[] arr2 = arr1 //  참조한 배열의 변수가 바뀌면 같이 바뀜! 참조된 배열의 변수를 바꿔도 같이 바뀜!

		int[] num = { 1, 2, 3, 4, 5 };

		int[] copy = num;

		num[0] = 3;
		copy[2] = 20;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(copy));
		System.out.println(num.hashCode() == copy.hashCode());

//       깊은 복사 : 동일한 새로운 배열을 하나 생성해서 내부의 값들도 함께 복사

		
//	     for문을 이용한 복사   // i값을 이용해서 반복해서 복사
		

		int[] num1 = { 1, 2, 3, 4, 5 };

		int[] copy1 = new int[5];

		for (int i = 0; i < num.length; i++) {
			copy1[i] = num1[i];
			num1[0] = 3;
			copy1[2] = 20;
			System.out.println(Arrays.toString(num1));
			System.out.println(Arrays.toString(copy1));
			System.out.println(num1.hashCode() == copy1.hashCode());
		}
		
//		System.arraycopy 를 이용하는 방법
//		System.arraycopy(원본배열,원본시작 인덱스, 복사본배열, 복사본시작 인덱스, 복사할 길이)
		
		int[]num2 = {1,2,3,4,5};
		int[]copy2 = new int[5];
		System.arraycopy(num2, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		
//		Arrays 클래스에서 제공하는 copy Of() 메소드를 활용하는 방법
//		Arrays.copyOf(원본 배열, 복사본배열길이)
		
		
		int[]num3 = {1,2,3,4,5};
		int[]copy3 = null;
	    copy3 = Arrays.copyOf(num3, num3.length);
	 
	
		System.out.println(Arrays.toString(copy3));
		
//		배열의 clone() 매소드를 이용하는 방법
		int[]num4 = {1,2,3,4,5};
		int[]copy4 = null;
		
		copy4 = num4.clone();
		System.out.println(Arrays.toString(copy4));
	}

	public void method6() {

		
		
	}

	public void method7() {

	}

}
