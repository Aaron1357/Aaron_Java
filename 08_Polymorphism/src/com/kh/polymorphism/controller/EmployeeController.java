package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.parent.*;

import com.kh.polymorphism.model.child.*;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	Employee ep = new Employee();
	// EmployeeController ec = new EmployeeController(); // 왜 인스턴스 호출해요!!

	public Employee findEmloyeeByName(Employee[] ea, String name) {

		Employee employee = null; // int a 같은거임

		for (int i = 0; i < ea.length; i++) {
			if (ea[i].getName().equals(name)) {
				employee = ea[i]; // ea[i] 여기서 i안에 객체가 들어있어요!!
			}
		}
		return employee;

	}

	public int getAnnualSalary(Employee e) { // 연봉계산 엔지니어는 보너스가있음
		int sum = 0;
		if (e instanceof Engineer) {
			sum = ((Engineer) e).getBonus() + e.getSalary() * 12; // ((Engineer) e) ,<< employee e가 engineer e로 형변환
			return sum;
//			instanceOf 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인할때 사용
		} else
			sum = e.getSalary() * 12;
		return sum;
	}

	public int getTotalCoast(Employee[] ea) { // 전체 연봉 총 합계
		int sum = 0;
		for (int j = 0; j < ea.length; j++) {

			sum += getAnnualSalary(ea[j]);
		}

		return sum;
	}
}
