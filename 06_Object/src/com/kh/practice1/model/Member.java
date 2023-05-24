package com.kh.practice1.model;
import java.util.*;


public class Member {
//	---------------속성--------------
	Scanner sc = new Scanner(System.in);
	
	public String memberld;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	
//	--------------기능---------------
	public void changeName(String nameInPut) {
		memberName = nameInPut;
		
	}
	public void printName() {
		
		System.out.println(memberName);
	}
}
