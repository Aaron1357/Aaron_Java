package com.kh.Operator;
import java.util.*;
public class E_Logical {
	
	
	// $논리 연산자$
	
	// 두개의 논리값을 연산해주는 연산자
	// 논리연산한 결과도 논리값입니다.
	
	// &&는 AND ||는 OR
	
	public void method1()  {
		
		int number = 0;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		//입력값이 1 ~ 100 사이인지 확인
		
		System.out.println("임의의 정수 값을 입력해주세요 >" );
		number = sc.nextInt();
		result = (1 <= number) && (number <= 100);
		System.out.println(number + "는 1부터 100사이에 값인가요?" + result );
	
		
		
		
	}
	
    public void method2()  {
		
		
		int number = 10;
		boolean result = false;
		
//      && 기준 앞에서 이미 false가 나오면 뒤의 연산 수행 X		
		
		result = (number < 5) && (++number > 0);
		
//		|| 기준 앞에서 이미 true가 나오면 뒤의 연산 수행 X	
		
		result = (number <20) || (++number > 0);
	} 
	
    public void method3()  {
		
	 Scanner sc = new Scanner(System.in);
	 
	 String word;
	 boolean result = true;
	 
	 
	 System.out.println("문자 입력 해주세요 >");
	 word = sc.nextLine();
	 char ch = sc.nextLine().charAt(0);
	 
	 result = (65 <= (int)ch) && ((int)ch <= 90);
	 
	 System.out.println("이 문자는 대문자입니까? " + result);
	 
	 
		
		
	}
	
	public static void main(String[] args) {
		
		
		E_Logical e = new E_Logical();
		e.method1();
		e.method2();
		e.method3();
		
		
	}

	
}
