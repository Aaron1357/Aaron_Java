package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);
//	$Switch문$

//	switch(조건식) {
//	case 값1:
//		코드~~
//		break;
//		
//	case 값2:
//		코드~~
//		break;
//		
//	default :
//		조건식 모두 불만족시 실행코드~~
//		
//	} 조건식 결과는 정수,문자,문자열만 가능하다아 

//   조건문을 빠져나오려면 브레이끼~

	public void method1() {

		int a = 0;
		String b = "";
		a = sc.nextInt();

		if (a == 1) {
			b = "빨간색";
		} else if (a == 2) {
			b = "파랑색";
		} else if (a == 3) {
			b = "초록색";

		} else {
			b = "잘못 입력했대";
		}
		System.out.println(b);

	}

	public void method2() {

		int a = 0;
		String b = "";
		a = sc.nextInt();

		switch (a) {

		case 1:
			b = "빨간색";
			break;

		case 2:
			b = "파랑색";
			break;

		case 3:
			b = "초록색";
			break;

		default:
			b = "잘못 입력하셨습니다";
			break;

		}
	}

	public void practice1() {
		int root = 0;
		String b = "";
		System.out.println("숫자를 입력해주세용");
		root = sc.nextInt();

		switch (root) {

		case 1:
			b = "관리권한, 글쓰기권한, 읽기권한";
			break;
		case 2:
			b = "글쓰기권한, 읽기권한";
			break;
		case 3:
			b = "읽기권한";
			break;

		}
		System.out.println(b);

	}

	public void practice2() {

		int a = 0;
		String b = "";

		System.out.println("월을 입력하세요");
		a = sc.nextInt();

		switch (a) {

		case 1:
			b = "겨울";
		case 2:
			b = "겨울";
			break;

		case 3:
		case 4:
		case 5:
			b = "봄";
			break;

		case 6:
		case 7:
		case 8:
			b = "여름";
			break;

		case 9:
		case 10:
		case 11:
			b = "가을";
			break;

		case 12:
			b = "겨울";
			break;

		}
		System.out.println(b);

	}

	public static void main(String[] args) {

		B_Switch b = new B_Switch();
		// b.method1();
		// b.method2();
		// b.practice1();
		b.practice2();

	}
}
