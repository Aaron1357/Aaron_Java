package com.kh.practice.model;

public class Book {

	private String tilte; //도서명

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	@Override
	public String toString() {
		return "Book [tilte=" + tilte + "]";
	}

	public Book(String tilte) {
		this.tilte = tilte;
	}

	public Book() {
	}
}
