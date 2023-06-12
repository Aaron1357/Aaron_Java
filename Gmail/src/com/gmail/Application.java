package com.gmail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.gmail.model.*;
import com.gmail.controller.*;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	private MailController mailcontrol = new MailController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		System.out.println("===== Gmail =====");

		boolean check = true;
		while (check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 입력 : ");
			System.out.println("=================");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				break;
			case 9:
				check = false;
				System.out.println("프로그램 종료");
				break;
			default : System.out.println("잘 못 입력하셨습니다"); mainMenu();
			}
		}
	}

	public void joinMembership() {

		/*
		 * 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은 Member 객체에 담고 id와 객체는
		 * MemberController(mc)의 joinMembership()로 보냄
		 * 
		 * 받은 결과에 따라 true면 "성공적으로 회원가입 완료하였습니다." false면 "중복된 아이디입니다. 다시 입력해주세요." 출력
		 * 
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();

		Member member = new Member();
		member.setName(name);
		member.setPassword(password);

		if (mc.joinMembership(id, member)) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else
			System.out.println("실패");

	}

	public void login() {

		/*
		 * 아이디와 비밀번호를 사용자에게 받아 mc의 login() 메서드로 넘겨 줌 반환 값 있으면 "OOO님, 환영합니다!" 출력 후 로그인 된
		 * 화면으로(memberMenu()) 없으면 "틀란 아이디 또는 비밀번호입니다. 다시 입력해주세요." 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		if(mc.login(id, password) != null) {
		realMenu();
		}
		else System.out.println("아이디 혹은 비밀번호가 틀렸습니다");
		login();

	}

	public void realMenu() {
		boolean check = true;
		while (check) {
			System.out.println("====== 환영합니다 ======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 새 메일 작성하기");
			System.out.println("3. 보낸 메일 확인하기");
			System.out.println("4. 보낸 메일함 비우기");
			System.out.print("메뉴 번호 입력 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				memberMenu();
				break;
			case 2:
				myMail();
				break;
			case 3:
				totalMail();
				break;
			case 4:
				deleteMail();
				break;
		default : System.out.println("잘 못 입력하셨습니다"); realMenu();
			}
		}
	}

	public void memberMenu() {
		boolean check = true;
		while (check) {
			System.out.println("****** 회원 메뉴 ******");
			System.out.println("1. 이름 바꾸기");
			System.out.println("2. 비밀번호 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				changeName();
				break;
			case 2:
				changePassword();
				break;
			case 3:
				 mainMenu();
				break;
			default : System.out.println("잘 못 입력하셨습니다"); memberMenu();
			}
		}
	}

	public void changePassword() {

		/*
		 * 아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 changePassword()로 보냄 받은 결과 값이 true면
		 * "비밀번호 변경에 성공했습니다." false면 "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();

		mc.changePassword(id, oldPw, newPw);
	}

	public void changeName() {

		/*
		 * 아이디와 비밀번호를 받아 mc의 login()으로 넘겨 현재 저장되어 있는 이름을 받고 사용자에게 현재 저장되어 있는 이름을 출력하여
		 * 보여줌 변경할 이름을 받아 mc의 changeName()로 id와 함께 넘기고 "이름 변경에 성공하였습니다." 출력 만약
		 * login()로부터 저장되어 있는 이름을 받지 못 했다면 "이름 변경에 실패했습니다. 다시 입력해주세요" 출력
		 */
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("현재 설정 된 이름 : " + mc.login(id, password));
		System.out.println("변경할 이름 : ");
		String newName = sc.nextLine();
		mc.changeName(id, newName);
	}

public void myMail(){
	System.out.println("====메일 보내기 메뉴 ====");
	System.out.println("메일을 보낼 주소를 적어주세요");
	String who = sc.nextLine();
	System.out.println("메일 제목을 적어주세요");
	String mailIndex = sc.nextLine();
	System.out.println("메일 내용을 적어주세요");
	String mailnote = sc.nextLine();
	
	Mail mail = new Mail();
	mail.setMailIndex(mailIndex);
	mail.setMailnote(mailnote);
	
	if(mailcontrol.myMail(who, mail) != "") {
		 System.out.println(mailcontrol.myMail(who, mail));
	}
}

	public void totalMail() {
		 //m
	System.out.println(mailcontrol.totalMail());
		
			
		}	
	public void deleteMail() {
		
		System.out.println("지울 메일의 수신인을 적어주세요");
		String who = sc.nextLine();
		
		System.out.println(mailcontrol.deleteMail(who));
		
		
	}	
	}
   



