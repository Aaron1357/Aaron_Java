package com.kh.loop;

import java.util.*;

public class D_While {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		int a = 0;
		while (a == 5) {
			System.out.println(a);
			a++;
		}
	}

	public void method2() {

		int i = 0;
		while (true) {
			System.out.println("숫자입력");
			i = sc.nextInt();
			System.out.println(i);
		}
	}

	public void method3() {

		int i = 1;

		do {
			System.out.println("Hello");

		} while (i != 1);

	}

	public void method4() {

		double b = Math.random() * 100 + 1;
		int bchange = (int) b;
		int root = 0;
		int repeat = 0;

		while (true) {
			System.out.println("정답을 맞춰보세요");
			root = sc.nextInt();

			if (root > bchange) {
				System.out.println("정답이 " + "보다 낮은 수 입니다.");
				++repeat;
				continue;
			} else if (root < bchange) {
				System.out.println("정답이 " + "보다 큰 수 입니다.");
				++repeat;
				continue;
			} else {
				System.out.println("정답입니다." + repeat + " 번 만에 맞췄습니다.");
				break;
			}
		}

	}

	public void method5() {

		int choose = 0;
		int in = 0;
		int out = 0;
		int account = 0;
        boolean run = true;
		while (run) {
			System.out.println("메뉴를 골라주세요");
			System.out.println(" 1. 입금 2. 출금 3.잔고 4.종료");
			choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("예금 메뉴입니다." + "예금하실 금액을 입력해주세요");
				in = sc.nextInt();
				account += in;
				System.out.println("입금 되었습니다. 현재 금액 : " + account);
				continue;

			case 2:
				System.out.println("출금 메뉴입니다." + "출금하실 금액을 입력해주세요");
				out = sc.nextInt();
				if (account < out) {
					System.out.println("잔액이 부족합니다");
					continue;
				} else
					account -= out;
				System.out.println("출금 되었습니다." + "남은금액 :" + account);

			case 3:
				System.out.println(" 현재 잔고는 :" + account + "입니다.");
				continue;

			case 4:
				System.out.println("종료합니다");
				run = false;
				break;
                
			}
			
		}
	}

	public void method6() {

	}

	public static void main(String[] args) {

		D_While d = new D_While();
		// d.method1();
		// d.method2();
		// d.method3();
		// d.method4();
		d.method5();
		// d.method6();

	}
}
