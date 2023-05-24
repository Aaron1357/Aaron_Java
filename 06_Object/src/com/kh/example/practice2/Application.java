package com.kh.example.practice2;

import com.kh.example.practice2.model.*;

public class Application {
	public static void main(String[] args) {

		Circle circle1 = new Circle();

		System.out.println("원의 둘레는 : " + circle1.printCD());
		System.out.println("원의 넓이는 : " + circle1.printCN());

		circle1.incrementRadius();

		System.out.println("원의 둘레는 : " + circle1.printCD());
		System.out.println("원의 넓이는 : " + circle1.printCN());

	}
}
