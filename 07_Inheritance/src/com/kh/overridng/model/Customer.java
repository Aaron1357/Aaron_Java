package com.kh.overridng.model;

import javax.swing.BoundedRangeModel;

public class Customer extends Object {

	protected String name;
	protected String grade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";
		this.bonusRatio = 0.01;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint + ", bonusRatio="
				+ bonusRatio + "]";
	}
	@Override // << 에노테이션
	public boolean equals(Object obj) {
		Customer C = (Customer) obj; 
		
		return this.name == C.name;
		
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	
}
