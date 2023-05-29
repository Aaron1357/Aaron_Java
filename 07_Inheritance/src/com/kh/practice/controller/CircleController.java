package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {

	Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {

		c.setX(x);
		c.setY(y);
		c.setRadius(radius);

		return "넓이" + (int) (3.14 * c.getRadius() * c.getRadius());
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);

		return "둘레" + (int) (3.14 * c.getRadius() * 2);

	}

}
