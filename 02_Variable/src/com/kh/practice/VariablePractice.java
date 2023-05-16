package com.kh.practice;
import java.util.*;

public class VariablePractice {
	
	 public static void main(String[] args) {
	       
	    	VariablePractice v = new VariablePractice();
	   
	    	v.method1();
	    	v.method2();
	    	v.method3();
	    	v.method4();
	    	
	    }
	 
	 
	  public static void method1() {
		  
		  Scanner sc = new Scanner(System.in);

	        System.out.println("첫 번째 정수를 입력하세요 >");
	        int a = sc.nextInt();
	        System.out.println("두 번째 정수를 입력하세요 >");
	        int b = sc.nextInt();

		    int plus = a + b;
	        int minus = a - b;
	        int tt = a * b;
	        int sp = a / b; 

	        System.out.println("더하기 결과 : " + plus);
	        System.out.println("빼기 결과 : " + minus);
	        System.out.println("곱하기 결과 : " + tt);
	        System.out.println("나누기 결과 : " + sp);
	        System.out.println("---------------------");
	  }
	  
  public static void method2() {
		  
		

	     int adult = 10000;
	     int teen = 7000;
	     int total = (2 * adult) + (3 * teen);
	       

	        System.out.println("성인 2명 : " + (adult * 2));
	        System.out.println("청소년 3명 : " + (teen * 3));
	        System.out.println("총 금액 : " + total);
	        System.out.println("--------------------");
	        
	        
	  }
	  
  public static void method3() {
	  
		

	     int x = 5;
	     int y = 7;
	     int z = 9;
	     
	     
	     int a;
	    
	     
	     
	     a = x;
	     x = y;
	     y = z;
	     z = a;
	     
	    	
	       

	        System.out.println("x=" + x);
	        System.out.println("y=" + y);
	        System.out.println("z=" + z);
	        System.out.println("--------------------");
	        
	        
	  }
   
 
  public static void method4() {
	  
		 Scanner sc = new Scanner(System.in);
		 String a = sc.nextLine();
		 
	     char first = a.charAt(0);
	     char last = a.charAt(7);
	     
	        System.out.println("첫번째 문자 : " + first);
	        System.out.println("마지막 문자 : " + last);
	        System.out.println("--------------------");
	        
	        
	  }

       
   
}

 
