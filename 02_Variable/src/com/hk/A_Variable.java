package com.hk;

public class A_Variable {
	
	// $변수$ (Variable) 
		// 하나의 값을 저장하는 "공간"
		//
			
	
	public static void main(String[] args) {
	
		//실행할 메소드가 있는 클래스를 생성해야한다 New
		A_Variable v = new A_Variable();
		//메소드를 실행 (호출)
		v.printValue();
		
	}
		public void printValue() {
			
		System.out.println(10 * 2 * 3.141592);//원의 둘레 = 반지름 * 2 * 3.141592
		System.out.println(10 * 10 * 3.141592); // 원의 넓이 = 반지름 * 반지름 * 3.141592
	    System.out.println("-----------------------");	
	    
	    //변수 사용 예시
	    int r = 10; //반지름
	    double pi = 3.141592; //파이
	    
	    System.out.println(r * 2 * pi);
	    System.out.println(r * r * pi);
		}
	
		public void VariableTest() {
			
			// $변수의 선언$
			// 자료형 변수명;
			// 자료형은 어떤 값을 저장할지, 어떤 크기의 메모미를 할당할지에 대한 정보
			
			// 변수명
			// 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
			
			// 변수의 초기화 (초기값 설정)
			// 변수명 = 값(리터럴);
			
			// "=" 는 오른쪽의 데이터를 왼쪽에 대입하는 대입연산자.
			
			
			
		    // $기본 자료형$
			// 실제 값을 저장
			
			
			// 논리형
			
			boolean isTrue; //1byte
			isTrue = true;
			
			boolean isFalse = false;
	
			
			// 문자형
			 
			 char ch = 'a'; //2byte
		     ch = 'b';
		     
		    
		     // 정수형
		     
		     byte   bNum;  // 1byte(8bit)
		     short  sNum;  // 2byte
		     int    iNum;  // 4byte
		     long   lNum;  // 8byte
		     
		    bNum = 4444;   // OverFlow
		    lNum = 11111111111L;  // 숫자 뒤에 L을 입력해야한다
		    
		    // 실수형
		    
		    float fNum; // 4byte
		    double dNum;// 8byte
		    
		    fNum = 3.14f; // 숫자 뒤에 F를 입력해야한다.
		    dNum = 3.14;
		    
		    // $참조 자료형$ (클래스)
		    // 주소 값이 저장이 된다.
		  
		    
		    String name = "이한주"; //4 byte
		    
		    
		    // $변수의 명명규칙$
		    
		    // 1) 대/소문자 구분가능
		    int number;
		    int Number;
		    int NUMBER;
		    
		    // 2) 숫자로 시작 X
		    int 1cake; // x
		    int cake1; // o
		    
		    // 3) 특수문자는 '_' , '$' 두가지만 사용가능
		    int cake$;
		    int _cake;
		    
		    // 4) 예약어 사용불가
		    int int;  // x
		    int void; // x
		    
		    // 5) 낙타표기법
		    // 첫 글자는 항상 소문자로 시작
		    // 여러 단어를 사용 할 때 단어 첫 글자를 대문자로 사용
		    int pieceOfCake;
		    
		    
		    
		   public void constant() {
			   
			   
		   // $상수$ (constant)
		  
			   
		  // final 자료형 변수명;
		  // 변하지 않는 값
		  // 변경 하지 않을 값에 대해 상수로 지정
		  // 초기화 이후에 값 변경 불가
			   
		  // 상수의 명명규칙
		  // 대문자로 작성
			final int CAKE;
			CAKE = 30;
		   
		   
		   }
			
			
			   
		   }
		    
		
	
			
		}
		
		
		
		
	
}
