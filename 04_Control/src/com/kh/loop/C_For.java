package com.kh.loop;

import java.util.*;

public class C_For {

//	$For문$
//  for( 초기식; 조건식; 증감식;)
//	주어진 횟수만큼 코드를 반복 실행하는 구문

//	초기식은 반복문이 실행될 때 단 한번만 실행되는 부분
//	반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다

//	조건식은 결과가 false면 실행 코드를 수행하지 않고 반복문을 빠져나간다

//	증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문.

//	continue문
//	반복문 안에서 continue문을 만나면 "현재 구문"을 종료
//	반복문을 벗어나는 건 아님! 다음 반복을 계속 수행

	Scanner sc = new Scanner(System.in);

	public void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
	}

	public void method2() {
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

	}

	public void method3() {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public void method4() {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 1) {
				System.out.println(i);
			}
		}
	}

	public void method5() {

		int result = 0;

		for (int i = 0; i <= 11; i++) {
			if (i == 11) {
				continue;
			}
			result = result + i;
		}

		System.out.println(result);
	}

	public void method6() {

		int a = 0;
		int total = 0;

		System.out.println("값을 입력하세요");
		a = sc.nextInt();

		for (int i = 0; i <= a; i++) {
			total += i;
		}
		System.out.println(total);
	}

	public void method7() {

		double b = Math.random() * 100;
		int total = 0;

		for (int i = 0; i <= b; i++) {
			total += i;
		}
		System.out.println(total);
	}

	public void method8() {

		String a = "";
		System.out.println("문자를 입력하세요.");
		a = sc.nextLine();

		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
	}

	public void method9() {

		String a = "";
		System.out.println("문자를 입력하세요.");
		a = sc.nextLine();

		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
	}

	public void method10() {

		int a = 0;
		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}

	public void method11() {

		for (int i = 2; i < 10; i++) {
			System.out.println(">_< " + i + " 단" + " >_< ");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (j * i));
			}
		}

	}

	public void method12() {

		int a = 0;
		int b = 0;
		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();

		System.out.println("숫자를 입력하세요.");
		b = sc.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println();
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}

		}

	}

	public void method13() {

		int a = 0;
		int b = 0;

		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();

		for (int i = 1; i < a + 1; i++) {
			System.out.println();
			for (int j = 1; j < a + 1; j++) {
				if (j == i) {
					System.out.print(i);
				} else
					System.out.print("*");
			}

		}

	}

	public void method14() {

		int a = 0;

		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println();
			for (int j = 1; j < a + 1; j++) {
				if (j > i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}

		}

	}

	public void method15() {

		int a = 0;

		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();

		for (int i = 1; i < a + 1; i++) {
			System.out.println();
			for (int j = a; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}

		}

	}

	public static void main(String[] args) {

		C_For c = new C_For();
		// c.method1();
		// c.method2();
		// c.method3();
		// c.method5();
		// c.method6();
		// c.method7();
		// c.method8();
		// c.method9();
		// c.method10();
		// c.method11(); cltr + alt + 방향키
		// c.method13();
		// c.method14();
		c.method15();

	}
}
