package com.kh.practice;
import java.util.*;

public class VariablePractice {
	
	 public static void main(String[] args) {
	       
	    	VariablePractice v = new VariablePractice();
	   
//	    	v.method1();
//	    	v.method2();
//	    	v.method3();
	    	v.method4();
	    	
	    }
	 
	 // static을 사용하게 되면 메서드만 호출해도 되는데요
	 // static은 객체 들어가서 설명을 자세하게 하겠지만 프로그램이 종료될 때까지 가비지 컬렉터가 회수하지 않기 때문에
	 // 많은 수의 static 메서드가 존재하면 메모리에 영향을 끼쳐요!
	 
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
	  
	  
	  // 너무 귀찮을 수도 있겠지만 코드 줄 맞춰주는 게 가독성이 더 좋아져요!
	  
public static void method2() {
		  
		

	     int adult = 10000;
	     int teen = 7000;
	     int total = (2 * adult) + (3 * teen);
	       

	        System.out.println("성인 2명 : " + (adult * 2));
	        System.out.println("청소년 3명 : " + (teen * 3));
	        System.out.println("총 금액 : " + total);
	        System.out.println("--------------------");
	        
	        
	  }


  // 오! 이렇게 했으면 했던 코드대로 작성하셨어요! 잘하셨습니다 :)
  // 임시로 지정한 변수명은 temp로 많이들 지정하기도 하지만 사실 상관없기도 해서 GOOD!
	  
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
	     // 여기 부분! 직접 지정하셨군요~~ 아마 이렇게 해놓으시면 글자수가 작은 단어를 입력하면 에러가 나실거에요 :)
	     // 뒤에 배울 내용을 통해 알 수 있으니 그때 풀어보셔도 되구요. 시간 되실 때 다른 방법은 없을까? 생각해보셔도 됩니다.
	     
	        System.out.println("첫번째 문자 : " + first);
	        System.out.println("마지막 문자 : " + last);
	        System.out.println("--------------------");
	        
	        
	  }

       
   
}

 
