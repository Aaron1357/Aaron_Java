package com.kh.polymorphism;

import com.kh.polymorphism.model.parent.*;
import com.kh.polymorphism.controller.EmployeeController;
import com.kh.polymorphism.model.child.*;

public class Application {

//	$다형성$

//	하나의 객체변수가 여러가지 모양과 모습을 가지는 능력
//	부모 타입으로 자식객체를 생성하는 거시다
	public static void main(String[] args) {

		Employee m2 = new Manager("강호동", 23000, "체육부");
		Employee eg2 = new Engineer("김영철", 56000, "Java", 200);
		Employee s2 = new Secretary("서장훈", 34000, "강호동");


//		 다형성 + 객체 배열
		Employee[] empArr = { m2, eg2, s2 };
		
			// 이름으로 사람 찾기

			EmployeeController ec = new EmployeeController();
			Employee find = ec.findEmloyeeByName(empArr, "김영철");
			System.out.println(find);

			// 연봉은?
			System.out.println(find.getName() + "의 연봉 : " + ec.getAnnualSalary(find));

			// 전체의 연봉 총 합은?
			System.out.println("연봉 총 합계 : " + ec.getTotalCoast(empArr));

		}
	}

