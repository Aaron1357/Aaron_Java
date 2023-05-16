package com.hk;

public class C_Printf {
	
	public static void main(String[] args) {
		
	// System.out.print("출력 하고자 하는 값");   출력
		
	// System.out.println("출력 하고자 하는 값"); 출력 + 줄바꿈
		
    // System.out.printf("출력 하고자 하는 형식",출력하고자하는 값, 값...); 
	// %d = 정수 %f = 실수 %c = 문자 %s = 문자열
		
		
      	System.out.print("Hello\n"); // \n = 줄바꿈
	    System.out.println("Hello");

	    int iNum1 = 10;
	    int iNum2 = 20;
	    
	    System.out.printf("%d%%\n %d%%\n",iNum1,iNum2);
	    
	    System.out.println("----------------");
	    
	    System.out.printf("%5d\n", iNum1);
	    System.out.printf("%-5d\n", iNum1);
             	   
	    System.out.println("----------------");
	
	    double dNum1 = 1.23456789;
	    double dNum2 = 4.53;
	    
	   
	    
        System.out.printf("%f\t %f\n",dNum1,dNum2); // 무조건 소수점 아래 6자리까지 보여줌
        System.out.printf("%.3f\t %.2f\n", dNum1,dNum2); 
        

        System.out.println("----------------");
        
        char ch = 'a';
        String str = "Hello";
        
        // a Hello a
        
        System.out.printf("%c %s %c\n",ch,str,ch);
        
        // A HELLO A
        
       System.out.printf("%C %S %C\n", ch,str,ch);
       
       // 
	}

}
