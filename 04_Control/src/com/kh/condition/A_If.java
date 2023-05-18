package com.kh.condition;

import java.util.Scanner;

public class A_If {
	

	Scanner sc = new Scanner(System.in); //인스턴트 변수
		
//	$IF$
	
//	if(조건식)    {...  
//	
//       	조건식이 참일 때 실행 할 코드  
//	        ...  }
//  보통 조건식에는 비교연산자 혹은 논리연산자를 사용한다.
	
	
	
//	$ IF else $

	//	if(조건식)   {...  	
//	        	조건식이 참일 때 실행 할 코드  
//		        ...  }
//	else  {... 
//	        조건식이 거짓일 때 실행 할 코드
//	            ...}


	
	//	$ IF else if$

	//	if(조건식)   {...  	
//	조건식이 참일 때 실행 할 코드  
//    ...  }
//	elseif(조건식2)   {...
//	조건식2일때 실행할 코드 
//  else  {... 
//조건식이 거짓일 때 실행 할 코드
//    ...}
	
	public void method1() {
		
	   int score = 80; // 지역변수 (해당 메서드 안에서만 사용 가능한 변수)
	
	   if (score >= 60) { 
		System.out.println("합격");
	   }
	   if (score < 60) { 
	    System.out.println("불합격");
	   }
	   
	}
	
    public void method2() {
    	
    	int score = 0;
    	
    	System.out.println("점수 입력>");
    	score = sc.nextInt();
    	
    	if (score >= 60) {
    		System.out.println("합격");
    	}
    	
    	else { 
    		System.out.println("불합격");
    	}
    	//삼항연산자 
//        String result = (score >= 60) ? "합격" : "불합격";
    	
    }
	
    
    public void method3() {
    	String name = "";
    	
    	System.out.println("이름을 입력하라해~ >");
    	name = sc.nextLine();
    	
//    	System.out.println("김종휘" == name );
//    	System.out.println("김종휘".equals(name));
//    	System.out.println("김종휘".charAt(0));
    	
    	if (name.equals("김종휘")) {
    		System.out.println("본인이다해~");
		}
    	else System.out.println("본인이 아니다해~");
    }
    
    public void method4() {
    	
    	int number = 0;
    	
    	System.out.println("숫자입력");
    	number = sc.nextInt();
    	
    	if (number > 0) {
			System.out.println("양수입니다.");
		}
    	
    	else {
    		if(number == 0) {
    			System.out.println("0입니다");
    		}
    		else { System.out.println("음수입니다");
    		
    		}
    	}
    }
   
	public void method5() {
		
		int num = 0;
	    System.out.println("숫자입력 > ");
	    num = sc.nextInt();
	    
	    if(num > 0) {
	    	System.out.println("양수입니다");
	    } else if (num < 0) {
	    	System.out.println("음수입니다");
		} else 
			System.out.println("0입니다");
		
	}
	
	
	public void method6() {
		int score = 0;
		System.out.println("점수를 입력하세용 > ");
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80) {
			System.out.println("B등급");
		} else if (score >= 70) {
			System.out.println("C등급");
		} else if (score >= 60) {
			System.out.println("D등급");
	    } else if (score < 60) {
			System.out.println("F등급");
	    }
	  }
	
    public void practice1() {
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("첫번째 정수를 입력하세용");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세용");
		b = sc.nextInt();
		System.out.println("세번째 정수를 입력하세용");
		c = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(a);
		}if (b % 2 == 0) {
			System.out.println(b);
		}if (c % 2 == 0) {
			System.out.println(c);
		}
			
		
	
			
		
    	
	}

    public void practice2() {
	 
    	int a = 0;
	    System.out.println("정수를 입력해주세용 >");
	    a = sc.nextInt();
    	if (a > 0) {
			System.out.println("plus");
		}else if (a < 0) {
			System.out.println("minus");
		}else if (a == 0) { 
			System.out.println("zero");
		}
    	
		if (a == 0) {
    	}
    	else if (a % 2 == 0) {
			System.out.println("even");
		}else if (a % 2 != 0) {
				System.out.println("odd");
			
		}
    	
    
    }
	public static void main(String[] args) {
		
		A_If a = new A_If();
	
		//a.method1();
		//a.method2();
        //a.method3();
		//a.method4();
		//a.method5();
		//a.method6();
		//a.practice1();
		a.practice2();
				
		
    
		
	}
}


