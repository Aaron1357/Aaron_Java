package com.kh.polymorphism;
import com.kh.polymorphism.model.parent.*;
import com.kh.polymorphism.model.child.*;

public class Application {

//	$다형성$
	
//	하나의 객체변수가 여러가지 모양과 모습을 가지는 능력
//	부모 타입으로 자식객체를 생성하는 거시다
	public static void main(String[] args) {
		
		Employee e1 = new Employee("이수근",12000);
        Manager m1 = new Manager("강호동",23000,"체육부");		
		Engineer eg1 = new Engineer("김영철",56000,"Java",200);
		Secretary s1 = new Secretary("서장훈",34000,"강호동");
		
		System.out.println(e1);
		System.out.println(m1);
		System.out.println(eg1);
		System.out.println(s1);
		
//		다형성 사용 예시
		
		Employee m2 = new Manager("강호동",23000,"체육부");	
		Employee eg2 = new Engineer("김영철",56000,"Java",200);
		Employee s2 = new Secretary("서장훈",34000,"강호동");
		
		
		System.out.println(m2);
		System.out.println(eg2);
		System.out.println(s2);
		
//		 다형성 + 객체 배열
		Employee[] empArr = {e1,m2,eg2,s2};
		for (Employee employee : empArr) {
			System.out.println(employee);
			
			
		}
	}
}
