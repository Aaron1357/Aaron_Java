package com.kh.Operator;
import java.util.*;
public class F_Triple {

//	$삼항 연산자$
//	조건식 ? 식1 : 식2
//	True = 식1 | False = 식2를 출력
	
	public void method1() {
		
		int num = 0;
		String result = "";
	
		Scanner sc = new Scanner(System.in);
		
        System.out.println("정수값 입력 >");
        num = sc.nextInt();
        
        result = (num == 0) ? "0 이다" : ((num > 0) ? "양수이다" : "음수이다"); 
        System.out.println(result);
		
	}
	
	public void practice1() {
		
		// 사용자한테 두개의 정수 값을 받아서 두 정수의 곱셈결과가 100보다 큰 경우 결과가 100 이상입니다.
//		아닌 경우 100보다 작습니다
		
	Scanner sc = new Scanner(System.in);
		
	
        System.out.println("두개 정수값 입력 >");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = ((a * b) >= 100) ? "100 이상입니다" : "100 이하입니다.";
        
        System.out.println(result);
         
      
     
      	
		
	}
	
   
public void practice2() {
		
		// 사용자한테 문자를 하나 입력받아서
//	       입력한 문자가 대문자이면 "알파벳 대문자이다."
//	       아닌 경우 " 알파벳 대문자가 아니다." 
	
	
	Scanner sc = new Scanner(System.in);
		
	
        System.out.println("문자 입력 >");
        String a = sc.nextLine();
        char b = a.charAt(0);
       
       
     
        
        String result = ((b) >= 65) ? ((b <= 90) ? "알파벳 대문자이다." :" 알파벳 대문자가 아니다.") : "알파벳 대문자가 아니다.";
        
        System.out.println(result);
         
      
     
      	
		
	}
	
	
	public static void main(String[] args) {
		
		F_Triple f = new F_Triple();
		f.practice1();
		f.practice2();
		
	
		
	}
}
