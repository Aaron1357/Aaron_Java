package com.kh.practice;
import java.util.*;
public class OperatorPractice {

	public void method1 () {
	
		Scanner sc = new Scanner(System.in);
		
		int man = 0;
		int pen = 0;
		
	   System.out.println("인원 수를 입력하세요 >");
	   man = sc.nextInt();
	   System.out.println("연필 갯수를 입력하세요 >");
	   pen = sc.nextInt();
		
	   int result = pen / man;
	   int result2 = pen % man;
	   
	   System.out.println("1 인당 연필 개수 :" + result);
	   System.out.println("남은 연필 개수 :" + result2);
	   
	   
	   
	}
    public void method2 () {
		
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("양수를 입력하세요 >");
        int a = sc.nextInt();
        
        System.out.println(a - (a % 100));
        
        
 
    	
    	
    	
	}
    public void method3 () {
	 
    	Scanner sc = new Scanner(System.in);
    	
    	int a = 0;
    	int b = 0;
    	int c = 0;
        String result = "";
        
        System.out.println("입력 1 >");
        a = sc.nextInt();
        System.out.println("입력 2 >");
        b = sc.nextInt();
        System.out.println("입력 3 >");
        c = sc.nextInt();
        
        result = (a == b) ? ((c == a) ? "true" : "false") : "false";
        
        System.out.println(result);
    	
    
}
    public void method4 () {
    	
Scanner sc = new Scanner(System.in);
    	
    	int a = 0;
        String result = "";
        
        System.out.println("정수를 입력하세요 >");
        a = sc.nextInt();
        
        
        result = (a % 2 == 1) ? "홀수다" : "짝수다";

        
        System.out.println(result);
    	
	
}
    
    public void method5 () {

Scanner sc = new Scanner(System.in);
    	
    	int age = 0;
    	
        String result = "";
        
        System.out.println(" 나이를 입력하세요 >");
        age = sc.nextInt();
       
        
        result = (age >= 13) ? ((age <= 19) ? "청소년" : "성인") : "어린이"   ;
        
        System.out.println(result);
    	
}

    public void method6 () {

    	Scanner sc = new Scanner(System.in);
    	    	
    	    	int apple = 0;
    	    	int box = 0;
    	        int result = 0;
    	        int result2= 0;
     	       
    	       
    	        
    	        System.out.println(" 사과의 갯수를 입력하세요 >");
    	        apple = sc.nextInt();
    	        
    	        System.out.println(" 바구니의 크기를 입력하세요 >");
    	        box = sc.nextInt();
    	       
    	        result = apple / box;
    	        result2 = ((apple % box) != 0) ? ++result : result ;
    	             	       
    	        
    	        System.out.println(" 필요한 바구니의 수 : " + result );
    	   
    	        
    	        
    	        //사과200 바구니100 갯수2 
    	        //사과 123 바구니 10 갯수 13
    	        
    	       
    	    	
    	}

	
	public static void main(String[] args) {
		
		
		OperatorPractice p = new OperatorPractice();
		//p.method1();
		//p.method2();
		//p.method3();
		//p.method4();
		//p.method5();
		  p.method6();
		
		
	}
}
