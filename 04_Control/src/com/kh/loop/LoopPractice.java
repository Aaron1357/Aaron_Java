package com.kh.loop;

import java.util.*;

class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ConditionPractice p = new ConditionPractice();

		p.method1();

		p.method2();

		p.method3();

		p.method4();

		p.method5();

		p.method6();

	}

	/*
	 * 
	 * 
	 * 
	 * 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오. 사용자 입력 : 5 5 4 3 2 1
	 * 
	 * 
	 * 
	 */

	public void method1() {

		int a = 0;

		System.out.println("숫자를 입력해주세요");

		a = sc.nextInt();

		for (int i = a; i > 0; i--) {

			System.out.println(i);

		}

	}

	// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.

	public void method2() {

		int sum = 0;

		int count = 0;

		int number = 1;

		while (sum < 100) {

			if (number > 0) {

				sum = sum + number;

			} else {

				sum = sum - number;

			}

			count++;

			number = count + 1;

			if (count % 2 == 0) {

				number = -number;

			}

		}

		System.out.println("더해야 하는 항의 개수: " + count);

	}

	/*
	 * 
	 * 
	 * 
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 문자열 : banana / banana 안에 포함된 a 개수 : 3
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void method3() {

		int repeat = 0;

		String word = "";

		System.out.println("문자열을 입력하세요.");

		word = sc.nextLine();

		String A = "";

		System.out.println("문자를 입력하세요.");

		A = sc.nextLine();

		char a = A.charAt(0);

		for (int i = 0; i < word.length(); i++) {

			char ss = word.charAt(i);

			if (ss == a) {

				++repeat;

			}

		}

		System.out.println(A + " 안에 포함된 " + a + " 갯수 " + repeat + "개");

	}

	/*
	 * 
	 * 
	 * 
	 * 0이 나올 때까지 숫자를 출력하시오. (random 사용!) 7 3 4 2 3 4 0
	 * 
	 * 
	 * 
	 */

	public void method4() {

		while (true) {

			double a = Math.random() * 10;

			int b = (int) a;

			System.out.println(b);

			if (b != 0) {

				continue;

			} else {

				break;

			}

		}

	}

	/*
	 * 
	 * 
	 * 
	 * 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 1 : 3 2 : 2 3 : 1 4 : 0 5 : 4 6 : 0
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void method5() {

		int a1 = 0;

		int a2 = 0;

		int a3 = 0;

		int a4 = 0;

		int a5 = 0;

		int a6 = 0;

		for (int i = 0; i < 10; i++) {

			double a = Math.random() * 6 + 1;

			int b = (int) a;

			if (b == 1)

				++a1;

			if (b == 2)

				++a2;

			if (b == 3)

				++a3;

			if (b == 4)

				++a4;

			if (b == 5)

				++a5;

			if (b == 6)

				++a6;

		}

		System.out.println(" 1 : " + a1);

		System.out.println(" 2 : " + a2);

		System.out.println(" 3 : " + a3);

		System.out.println(" 4 : " + a4);

		System.out.println(" 5 : " + a5);

		System.out.println(" 6 : " + a6);

	}

	/*
	 * 
	 * 
	 * 
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 
	 * 
	 * 
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 당신의 이름을 입력해주세요 : 가위바위보 : 가위 컴퓨터 : 가위 박신우 : 가위 비겼습니다.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 가위바위보 : 가위 컴퓨터 : 바위 박신우 : 가위 졌습니다 ㅠㅠ
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 가위바위보 : 보 컴퓨터 : 바위 박신우 : 보 이겼습니다 !
	 * 
	 * 
	 * 
	 */

	public void method6() {

		String com2 = "";

		int user = 0;

		int countLose = 0;

		int countDraw = 0;

		System.out.println("사용자 이름을 입력하세요");

		String name = sc.nextLine();

		while (true) {

			double temp = Math.random() * 3 + 1;

			int com = (int) temp; // 컴퓨터의 가위 바위 보를 1 2 3으로 랜덤출력

			System.out.println("자! 가위 바위 보~!");

			String user2 = sc.nextLine();// 가위 바위 보 입력 받는 부분

			if (user2.equals("가위")) {

				user = 1;

			} else if (user2.equals("바위")) {

				user = 2;

			} else if (user2.equals("보")) {

				user = 3;

			} else

				System.out.println("잘못 입력하셨습니다");

			if (com == 1) {

				com2 = "가위";

			} else if (com == 2) {

				com2 = "바위";

			} else

				com2 = "보"; // 1 2 3이 가위 바위 보로 변경되는 부분

			if (com == user) {

				System.out.println("사용자 :" + user2 + " " + "컴퓨터 : " + com2);

				System.out.println("비겼습니다");
				++countDraw;

			} else if (com == 2 && user == 1) {

				System.out.println("사용자 :" + user2 + " " + "컴퓨터 : " + com2);

				System.out.println("졌습니다");
				++countLose;

			} else if (com == 1 && user == 3) {

				System.out.println("사용자 :" + user2 + " " + "컴퓨터 : " + com2);

				System.out.println("졌습니다");
				++countLose;

			} else if (com == 3 && user == 2) {

				System.out.println("사용자 :" + user2 + " " + "컴퓨터 : " + com2);

				System.out.println("졌습니다");
				++countLose;

			} else {

				System.out.println("사용자 : " + user2 + " " + "컴퓨터 : " + com2);

				System.out.println(" 이겼습니다!!  " + countDraw + " : 비긴 횟수 " + countLose + " :진 횟수");

				break;

			}

		}

	}

}