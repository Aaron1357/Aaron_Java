package com.kh.practice.model;

public class Rectangle extends Point {

	protected int width;
	protected int heigth;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.width = width;
		this.heigth = heigth;
		this.x = x;
		this.y = y;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
	}

	public String draw() {
		return "";
	}

}
