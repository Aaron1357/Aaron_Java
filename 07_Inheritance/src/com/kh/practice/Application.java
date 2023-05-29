package com.kh.practice;

import com.kh.practice.model.*;
import com.kh.practice.controller.*;
import java.util.*;

public class Application {

	static Scanner sc = new Scanner(System.in);
	static Application ap = new Application();
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	RectangleController rectanglecontroller;
	Circle c = new Circle();

	public static void main(String[] args) {

		ap.mainMenu();

	}

	public void mainMenu() {

		System.out.println("=====메뉴=====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 종료");
		System.out.println("=============");
		int choose = Integer.parseInt(sc.nextLine());

		switch (choose) {

		case 1:
			circleMenu();
		case 2:
			rectangleMenu();
		case 9:
			System.out.println("종료합니다");
		default:
			System.out.println("다시 입력해주세요");
			mainMenu();
		}

	}

	public void circleMenu() {

		System.out.println("=====원메뉴=====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 종료");
		System.out.println("==============");
		int choose = Integer.parseInt(sc.nextLine());

		switch (choose) {

		case 1:
			ap.calcCircum();

		case 2:
			ap.calcCircleArea();

		case 9:
			System.out.println("종료합니다");

		}

	}

	public void rectangleMenu() {
		System.out.println("=====사각형 메뉴=====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 종료");
		System.out.println("==============");
		int choose = Integer.parseInt(sc.nextLine());

		switch (choose) {

		case 1:
			ap.calcPerimeter();

		case 2:
			ap.calcRectArea();

		case 9:
			System.out.println("종료합니다");

		}
	}

	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());

		System.out.println(c.draw(x, y) + cc.calcCircum(x, y, radius));
		ap.mainMenu();
	}

	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());

		System.out.println(c.draw(x, y) + cc.calcArea(x, y, radius));
		ap.mainMenu();
	}

	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.println("넓이 : ");
		int width = Integer.parseInt(sc.nextLine());

		System.out.println(c.draw(x, y) + rc.calcPerimeter(x, y, height, width));
		ap.mainMenu();
	}

	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.println("넓이 : ");
		int width = Integer.parseInt(sc.nextLine());

		System.out.println(c.draw(x, y) + rc.calcArea(x, y, height, width));
		ap.mainMenu();

	}

}