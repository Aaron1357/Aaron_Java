package com.gmail.model;

import java.util.*;
import com.gmail.model.*;

public class User {

	Scanner sc = new Scanner(System.in);
	// -----------속성---------

	public String userId;
	public String userPw;
	public String userName;
	public String userphone;
	public int age;
	public char gender;
	
	
	public User(Scanner sc, String userId, String userPw, String userName, String userphone, int age, char gender) {
		this.sc = sc;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userphone = userphone;
		this.age = age;
		this.gender = gender;
	}


	public User() {
	}


	public Scanner getSc() {
		return sc;
	}


	public void setSc(Scanner sc) {
		this.sc = sc;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserphone() {
		return userphone;
	}


	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "User [sc=" + sc + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userphone=" + userphone + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

	
}
