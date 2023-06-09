package com.kh.practice.model;

public class Member {
    private String name;
	private int age;
	private int cookCoupon;
	private Book book;
	
	private Member() {}


	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", cookCoupon=" + cookCoupon + ", book=" + book + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getCookCoupon() {
		return cookCoupon;
	}


	public void setCookCoupon(int cookCoupon) {
		this.cookCoupon = cookCoupon;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
}
