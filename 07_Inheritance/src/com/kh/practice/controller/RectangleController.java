package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeigth(height);
		return "넓이" + (r.getWidth() * r.getHeigth());
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeigth(height);
		return "둘레" + ((r.getWidth() + r.getHeigth()) * 2);
	}
}
