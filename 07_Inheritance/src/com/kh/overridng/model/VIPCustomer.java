package com.kh.overridng.model;
import com.kh.overridng.model.*;
public class VIPCustomer extends Customer {

	private double saleRatio;

	public VIPCustomer() {
	}

	public VIPCustomer(String name) {
		this.grade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.5;
		this.name = name;
	}
	
	//오버라이딩
	//부모 클래스의 메소드명,매개변수,리턴타입 모두 동일
	//접근 제어자를 좁은 범위로 변경할 수 없다.
	// 부모클래스의 메서드가 protected라면, 범위가 같거나 넓은 protected나 public으로만 변경 가능
  public int calcPrice(int price) {
	  bonusPoint += price * bonusRatio;
	  return price - (int)(price * saleRatio);
  }
}
