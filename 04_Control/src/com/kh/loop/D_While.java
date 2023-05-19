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

	}

	public void method6() {

	}

	public static void main(String[] args) {

		D_While d = new D_While();
		// d.method1();
		// d.method2();
		// d.method3();
		d.method4();
		d.method5();
		d.method6();

	}
}
