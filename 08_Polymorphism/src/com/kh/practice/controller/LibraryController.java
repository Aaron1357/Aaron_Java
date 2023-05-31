package com.kh.practice.controller;

import javax.sql.rowset.serial.SQLOutputImpl;

import com.kh.practice.model.*;
import com.kh.practice.model.AniBook;
import com.kh.practice.model.Book;
import com.kh.practice.model.CookBook;

public class LibraryController {

	private Member member = null;
	private Book[] booklist = new Book[4];
	int i = 0;
	{
		booklist[0] = new CookBook("김대석 셰프의 집밥 레시피", true);
		booklist[1] = new CookBook("에브리데이 베이글", false);
		booklist[2] = new AniBook("원피스", 19);
		booklist[3] = new AniBook("최애의 아이", 15);

	}

	public void insertMember(String name, int age) {
		member = new Member(name, age);

	}

	public Member myInfo() {

		return member;

	}

	public Book searchBook(String keyword) {

		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i].getTilte().contains(keyword)) 
			{
				return booklist[i];
			}
		}
		// 문자열 contains
		return null;
	}

	public Book[] viewBooks() {

		return booklist;
	}

	public boolean rentBook(int index) {

		if (member.getAge() < 19 && index == 2) {
			return true;
		} else if (member.getAge() < 15 && index == 3) {
			return true;
		} else {
			member.setBook(booklist[index]);
			if (index == 0) {
				member.setCookCoupon(++i);
			}
		}
		return false;

	}

}
