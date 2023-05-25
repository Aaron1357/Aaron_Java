package com.gmail.controller;
import java.io.InputStream;
import java.util.*;
public class UserController {
	static Scanner sc = Scanner(System.in);
	// ----------기능---------
		public void loginMenu() {

			System.out.println("=========메뉴=========="); // 메뉴
			System.out.println("   1.로그인 2.회원가입");
			System.out.println("======================");
			int pick = sc.nextInt();
			sc.nextLine();

			switch (pick) {

			case 1:
				System.out.println("========(◕‿◕✿)=========");
				System.out.println("=====로그인 메뉴입니다.=====");
				System.out.println("=======================");
				login();
				break;
			case 2:
				System.out.println("========ლ(╹◡╹ლ)=========");
				System.out.println("=====회원가입 메뉴입니다.=====");
				System.out.println("=======================");
				signUp();
				break;
			}
		}

		private static Scanner Scanner(InputStream in) {
		return null;
		
	}

		public void login() {
			boolean statue = true;
			// 로그인
			System.out.println("아이디를 입력하세요");

			String idTemp = sc.nextLine();

			if (!idTemp.equals(userId)) {
				System.out.println("다시 시도해주세요");
				login();
			} else {

				while (statue) {
					System.out.println("패스워드를 입력하세요");
					String pwTemp = sc.nextLine();
					if (pwTemp.equals(userPw)) {
						System.out.println("로그인이 완료 되었습니다");
						statue = false;
						break;
					} else {
						System.out.println("다시 시도해주세요");
					}
				}
				loginMenu();
			}
		}

		public void signUp() { // 회원가입
			System.out.println("아이디를 입력하세요");
			userId = sc.nextLine();

			System.out.println("패스워드를 입력하세요");
			userPw = sc.nextLine();

			System.out.println("로그인 메뉴로 갑니다");
			login();

		}

		public void viewMail() { // 메일 아이디확인
		}

		public void changePw() { // 비밀번호 변경
		}

		public void exit() { // 탈퇴
		}

}
