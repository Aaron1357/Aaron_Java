
package com.hk;

import java.util.Scanner;


public class D_KeyboardInput {


	/* Scanner
	 * -화면(Console)으로부터 데이터를 "입력"받는 클래스
	 * 1) import java.util.Scanner; 추가
	 *
	 * 2) Scanner 클래스 생성
	 * 	  Scanner sc = new Scanner(System.in);
	 *
	 * 3) Scanner 클래스 사용
	 *	  입력 값이
	 *		- 문자열일 때 : sc.next()
	 *					 sc.nextLine()
	 *		- 정수일 때 : sc.nextInt()
	 *		- 실수일 때 : sc.nextFloat(), sc.nextDouble()
	 *
	 */

		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
    System.out.print("당신의 이름은 무엇입니까? > ");
    String name = sc.nextLine();

    System.out.print("당신의 집은 어디입니까? >");
    String home = sc.nextLine();
	
	System.out.print("당신의 나이는 몇 살 입니까? >");
	int old = sc.nextInt();
	
	System.out.print("당신의 키는 몇 센치 입니까? >");
	double tall = sc.nextDouble();
	
	System.out.print("당신의 성별은 무엇입니까? (남/여)");
	String line = sc.next();
	char gender = line.charAt(0);
	sc.nextLine();
	
	System.out.printf("당신의 이름은 %s이고 사는 곳은 %s 나이는 %d 키는 %.1f 성별은 %c 입니다" , name
			,home, old, tall, gender);




    
    

		
	}
}
