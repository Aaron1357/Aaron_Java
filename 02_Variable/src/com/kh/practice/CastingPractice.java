package com.kh.practice;
import java.util.*;
public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice a = new CastingPractice();
		a.method1();
		a.method2();
		
		
		
		
	}

    public void method1() {
    	
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("문자를 입력하세요 > ");
        String code = sc.nextLine();
    	char a = code.charAt(0);
    	
        System.out.println(a+ " " +"unicode : " + (int) a);
        System.out.println("B unicode : " + (int) (a + 1));
       0
    	
    	
    	
    	
    	
    	
    	
    }
    
 public void method2() {
    	
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("국어 :  ");
        int korean = sc.nextInt();
        
        System.out.println("영어 :  ");
        int english = sc.nextInt();
        
        System.out.println("수학 :  ");
        int math = sc.nextInt();
        
        double total = korean + english + math;
        double everage = total/3;
        
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f" ,everage);
        
        
        
       
        
    	
    	
    	
    	
    	
    	
    	
    }

}

  