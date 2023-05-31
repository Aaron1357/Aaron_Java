package com.kh.practice.model;

public class AniBook extends Book{

	private int accessAge;

	public AniBook() {
	}

	public AniBook(String tilte) {
		super(tilte);
		
	}

	public AniBook(String tilte, int accessAge) {
		super(tilte);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + "AniBook [accessAge=" + accessAge + "]";
	}
	
	
}
