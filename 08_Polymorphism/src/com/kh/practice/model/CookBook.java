package com.kh.practice.model;

public class CookBook extends Book{

	private boolean coupon;

	public CookBook() {
	}

	public CookBook(String tilte) {
		super(tilte);
		
	}

	public CookBook(String tilte, boolean coupon) {
		super(tilte);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString() + "CookBook [coupon=" + coupon + "]";
	}
	
	
}
