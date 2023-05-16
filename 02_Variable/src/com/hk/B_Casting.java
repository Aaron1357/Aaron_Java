package com.hk;

public class B_Casting {
	
	// $형변환$ (Casting)

	// 값의 타입을 다른 타입으로 변환하는 행위
	// Boolean을 제외한 다른 기본형은 서로 형변환이 가능
	
	public static void main(String[] args) {
		
		B_Casting c = new B_Casting();
        //c.autoCasting();		
		c.casting();
	}
	
	// $자동 형변환$ (묵시적 형변환)
    // 자동으로 변환되어 따로 조치 필요없음
	// 데이터 범위가 작은 자료형을 큰 자료형으로 변환 할 떄
	
    public void autoCasting() {
    	
    	byte b = 10;  //1byte
    	short s = b;  //2byte
    	int i = s;    //4byte
    	long l = i;   //8byte
    	
    	
    	float f = l;  //4byte
    	double d = l; //8byte
     	
    	System.out.println("b : " + b);
    	System.out.println("s : " + s);
    	System.out.println("i : " + i);
    	System.out.println("l : " + l);
    	System.out.println("f : " + f);
    	System.out.println("d : " + d);

    	
    	System.out.println("---------------------");
    	
    	
    	double result = 12 + 3.3;
    	int result2 = b + s;
    	
    	System.out.println(result);
    	System.out.println(result2);
    	
    	
    }
    	// $강제 형변환$ (명시적 형변환)
    	
    	// (자료형) 데이터;
    	// 큰범위 > 작은범위로 변경할때 사용
    	// 데이터 손실이 발생한다
    	
    	public void casting() {
    	   
    		double d = 4.123456788981;
    		float f = (float) d;
    		int i = (int) f;
    		
    		System.out.println("d : " + d);
    		System.out.println("f : " + f);
    		System.out.println("i : " + i);
    		
    		int sum = (int)(i + d);
    		int sum2 = i + (int)d;
    		
    	    System.out.println("sum :" + sum);
    	    System.out.println("sum2 :" + sum2);
    		
            System.out.println("--------------------------");
            
            int number = 290;
            byte bNumber = (byte)number;
            int number2 = 128;
            byte bNumber2 = (byte)number2;
            
            
            System.out.println("bNumber :" + bNumber);
            System.out.println("bNumber2 :" + bNumber2);
           
           
                     
            
            
           
    	
    	   
    		
    	  }
    	
      	
    		
  
    	
    	
    
    	
    	
    	
    	
    }
	

