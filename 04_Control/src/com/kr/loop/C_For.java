package com.kr.loop;
import java.util.*;
public class C_For {

//	$For문$
//  for( 초기식; 조건식; 증감식;)
//	주어진 횟수만큼 코드를 반복 실행하는 구문

//	초기식은 반복문이 실행될 때 단 한번만 실행되는 부분
//	반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다

//	조건식은 결과가 false면 실행 코드를 수행하지 않고 반복문을 빠져나간다

//	증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문.

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

		for (int i = 0; i < 10; i++){
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public void method4() {
       for (int i = 1; i < 10; i = i + 2) {
    	   System.out.println(i);
       }
       }
     

	public static void main(String[] args) {

		C_For c = new C_For();
		//c.method1();
		//c.method2();
		//c.method3();
		c.method4();
	}
}
