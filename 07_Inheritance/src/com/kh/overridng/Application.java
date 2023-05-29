package com.kh.overridng;

import com.kh.overridng.*;
import com.kh.overridng.model.*;

public class Application {

	public static void main(String[] args) {
		Customer customer1 = new Customer("김종휘");
		Customer customer2 = new Customer("김종휘");
		VIPCustomer VIP = new VIPCustomer("김종빈");
		VIPCustomer VIP2 = new VIPCustomer("김종빈");

		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(VIP);

		System.out.println(VIP.equals(VIP2));

		System.out.printf("%s님의 등급은 %s이며 지불해야하는 금액은 %d입니다 적립된 포인트는 %d입니다\n", customer2.getName(), customer2.getGrade(),
				customer2.calcPrice(1000), customer2.getBonusPoint());
		System.out.printf("%s님의 등급은 %s이며 지불해야하는 금액은 %d입니다 적립된 포인트는 %d입니다", VIP.getName(), VIP.getGrade(),
				VIP.calcPrice(1000), VIP.getBonusPoint());

	}
}
