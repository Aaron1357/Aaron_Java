package com.kh.practice.model;

import com.kh.practice.model.*;

public class Circle extends Point {

	protected int radius;

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public String draw() {
		return "";
	}
}
