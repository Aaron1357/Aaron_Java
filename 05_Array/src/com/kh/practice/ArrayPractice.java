package com.kh.practice;

import java.awt.font.FontRenderContext;
import java.sql.SQLOutput;
import java.util.*;

import javax.sql.rowset.serial.SQLOutputImpl;
import javax.swing.plaf.FontUIResource;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayPractice p = new ArrayPractice();
		// p.method1();
		// p.method2();
		// p.method3();
		p.method4();
		// p.method5();
	}

	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 */
	public void method1() {

		String[] fruit = { "포도", "참외", "키위", "용과", "망고" };
		System.out.println(fruit[3]);
	}

	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된
	 * 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5 -i *-i 5 -1* -1 = -4 배열 0번째 인덱스에 넣을 값 : 4 배열 1번째 인덱스에 넣을 값 : -4 (num *
	 * -1 -i) 배열 2번째 인덱스에 넣을 값 : 3 배열 3번째 인덱스에 넣을 값 : -3 배열 4번째 인덱스에 넣을 값 : 2 [4,
	 * -4, 3, -3, 2] 2
	 */
	public void method2() {
		int sum = 0;
		int num = 0;
		System.out.print("정수 : ");
		num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ", i);
			arr[i] = sc.nextInt();

			sum += arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}

	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을
	 * 출력하세요.
	 * 
	 */
	public void method3() {
		String order = "";
		String[] food = { "햄버거", "치킨", "콜라", "라면" };
		System.out.println("메뉴를 적어주세요");
		order = sc.nextLine();
		boolean check = false;

		for (int i = 0; i < food.length; i++) {
			if (food[i].equals(order)) {
				check = true;
				break;
			}
		}
		if (check == true) {
			System.out.println("배달가능");
		} else
			System.out.println("배달불가능");
	}

	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열은 건드리지 않고!
	 * 
	 * 주민등록번호 : 123456-1234567 123456-1******
	 * 
	 */
	public void method4() {

		System.out.println("주민번호를 입력해주세요");
		String num = sc.nextLine();
		String[] name = new String[num.length()];

		for (int i = 0; i < name.length; i++) {
			name[i] = String.valueOf(num.charAt(i));
			
		}
		String copy[] = name.clone();

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
			if(
			}
		}
	

	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요.
	 * 
	 * 단어 입력 : programming gnimmargorp
	 * 
	 */
	public void method5() {

	}

}
