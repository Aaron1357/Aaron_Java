package com.kh.step4;
import com.kh.step4.model.Car;
public class Application {

	
	public static void main(String[] args) {
		
		Car c1 = new Car ("White","auto",4);
		Car c2 = new Car ("Black","manual");
		
		System.out.println(c1);
		System.out.println(c2);
       
//		$오버 로딩$
		
//		한 클래스내에 동일한 이름의 메소드를 매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 한다.
        
		void test() {}
		//void test() {}     불가능 //같은 메서드
		void test(int a) {}
		void test(int a,String s) {}
		void test(String s,int a) {}
		void test(int a,int b) {}
		//void test(int c ,int d) 불가능 //위랑 같은 자료형
		
	}
	
}
