package com.kh.inheritance.child;
import com.kh.inheritance.parent.Product;

//                $상속$

//   접근제어자 class 자식클래스 extends 부모클래스 {
//           멤버변수 생성자 메서드
//    }


//          $상속을 쓰는 이유$

//  적은 양의 코드로 새로운 클래스 작성이 가능
//  코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
//  코드의 중복을 제거하여 프로그램의 생산성과 유지 보수에 크게 기여.


//            $상속의 특징$
//  클래스 간의 상속은 단일 상속만 가능
//  명ㅅ되어 있지 않아도 모든 클래스는 Object 클래스를 상속
//  Object 클래스에서 제공하는 메서드들을 오버라이딩하여 매서드 재정의가 가능
//   부모 클래스의 생성자, 초기화 블록은 상속되지 않는다
//   자식 클래스 생성 시에 부모 클래스 생성자가 먼저 실행됨.
//  부모의 private 멤버는 상속이 되지만 직접 접근이 불가능
//  getter setter 사용해서 접근하자


public class Notebook extends Product {

 
	private String cpu;

	public Notebook() {
		
		
	}

	public Notebook(String brand, String pCode, String name, int price, String cpu) {

		super(brand,pCode,name,price);
		this.cpu = cpu;
		
//		부모 멤버변수를 초기화 할 수 있는 방법 
//		Super : 해당 객체의 부모의 객체의 주소를 담고 있음.
		
//		  방법
		
//	    1. super.을 통해 부모의 멤버변수에 직접 접근
		
//	    부모가 Private - 직접 접근 불가. 
//		Default - 같은 패키지에서만 접근 가능. 
//		protected - 부모가 상속 단계일 때 자식 객체에서 접근이 가능
//		Public - 어디서든 접근 가능
	
//	    2. 부모클래스의 setter를 이용해서 접근
		
//	    부모클래스에서 setter 메소드를 제공하면, 자식 클래스에서 필드의 초기화 가능. 
//	    setBrand(brand);
	
//      3. 부모 생성자 호출해서 초기화		
		
		
	}

	@Override
	public String toString() {
		return  "Notebook [cpu=" + cpu + "]";
	}
	
	
	
}


