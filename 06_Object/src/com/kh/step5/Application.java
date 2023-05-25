package com.kh.step5;

import com.kh.step5.model.Book;

public class Application { 
	
	public static void main(String[] args) {
		
		Book b1 = new Book("HTML + CSS + 자바스크립트", 30000,0.2,"고영희");
		
		Book b2 = new Book();
		
		b2.setTitle("리액트 200제");
		b2.setPrice(25000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("이정열");
		
		System.out.println((int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate())) +"원");
		System.out.println((int)(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate())) +"원");

		
	
	
	}
}
