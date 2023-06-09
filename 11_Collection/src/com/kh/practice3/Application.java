package com.kh.practice3;

import java.util.Scanner;

import com.kh.practice3.controller.FarmController;
import com.kh.practice3.model.Farm;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public static void main(String[] args) {

		System.out.println("========== 햄스터 게시판 ==========");
		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		boolean check = true;

		while (check) {
			System.out.println("****** 메뉴 ******");
			System.out.println("1. 운영자 메뉴");
			System.out.println("2. 윤저 메뉴");
			System.out.println("9. 종료");

			try {
				System.out.print("메뉴 번호 선택 : ");
				switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					adminMenu();
					break;
				case 2:
					customerMenu();
					break;
				case 9:
					check = false;
					System.out.println("프로그램 종료");
					break;
				}

			} catch (Exception e) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}

		}
	}

	public void adminMenu() throws Exception {

		System.out.println("****** 직원 메뉴 ******");
		System.out.println("1. 새 게시글 추가");
		System.out.println("2. 게시글 삭제");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택 : ");
		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			addNewKind();
			break;
		case 2:
			removeKind();
			break;
		case 3:
			changeAmount();
			break;
		case 4:
			printFarm();
			break;
		case 9:
			break;
		}

	}

	public void customerMenu() throws Exception {

		System.out.println("햄스터 게시판");
		printFarm();
		System.out.println("****** 고객 메뉴 ******");
		System.out.println("1. 게시글 추천");
		System.out.println("2. 게시글 비추천");
		System.out.println("3. 추천 누른 글 보기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택 : ");
		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			buyFarm();
			break;
		case 2:
			removeFarm();
			break;
		case 3:
			printBuyFarm();
			break;
		case 9:
			break;
		}

	}

	public void addNewKind() throws Exception {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 추가할 농산물의 이름과 수량도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 addNewKind()로 넘기고 전달받은 반환 값이 true면 "새 농산물이 추가되었습니다.",
		 * false면 "새 농산물 추가에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		System.out.println("1. 자유 / 2. 정보 / 3. 질문");
		System.out.print("추가할 종류 게시글 카테고리 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("게시글 이름  : ");
		String name = sc.nextLine();
		System.out.print(": ");
		int amount = Integer.parseInt(sc.nextLine());

		String kind = null;
		switch (select) {

		case 1:
			kind = "과일";
			break;

		case 2:
			kind = "채소";
			break;

		case 3:
			kind = "견과";
			break;

		}

		Farm f = new Farm();

		f.setKind(kind);
		f.setName(name);

		if (fc.addNewKind(f, amount) == true) {
			System.out.println("새 농산물이 추가되었습니다.");
		} else
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");

	}

	public void removeKind() throws Exception {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 삭제할 농산물의 이름도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 removeKind()로 넘기고 전달받은 반환 값이 true면 "농산물 삭제에 성공하였습니다.",
		 * false면 "농산물 삭제에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("삭제할 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("삭제할 이름 : ");
		String name = sc.nextLine();

		String kind = null;
		switch (select) {

		case 1:
			kind = "과일";
			break;

		case 2:
			kind = "채소";
			break;

		case 3:
			kind = "견과";
			break;

		}

		Farm f = new Farm();

		f.setKind(kind);
		f.setName(name);

		if (fc.removeKind(f) == true) {
			System.out.println("농산물 삭제에 성공하였습니다.");
		} else
			System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");

	}

	public void changeAmount() throws Exception {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 수정할 농산물의 이름과 수량도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 changeAmount()로 넘기고 전달받은 반환 값이 true면 "농산물 수량이 수정되었습니다.",
		 * false면 "농산물 수량 수정에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("수정할 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 수량 : ");
		int amount = Integer.parseInt(sc.nextLine());

		String kind = null;
		switch (select) {

		case 1:
			kind = "과일";
			break;

		case 2:
			kind = "채소";
			break;

		case 3:
			kind = "견과";
			break;

		}

		Farm f = new Farm();

		f.setKind(kind);
		f.setName(name);

		if (fc.changeAmount(f, amount) == true) {
			System.out.println("농산물 수량이 수정되었습니다.");
		} else
			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");

	}

	public void printFarm() throws Exception {

		fc.printFarm();

		// fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해 "종류 : 이름(n개)" 형식으로 출력

	}

	public void buyFarm() throws Exception {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 구매할 농산물의 이름도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체를 fc의 buyFarm()으로 넘기고 전달받은 반환 값이 true면 "구매에 성공하였습니다.", false면
		 * "마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 */
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("구매 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("구매할 것 : ");
		String name = sc.nextLine();

		String kind = null;
		switch (select) {

		case 1:
			kind = "과일";
			break;

		case 2:
			kind = "채소";
			break;

		case 3:
			kind = "견과";
			break;

		}

		Farm f = new Farm();

		f.setKind(kind);
		f.setName(name);

		if (fc.buyFarm(f) == true) {
			System.out.println("구매에 성공하였습니다.");
		} else
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
	}

	public void removeFarm() throws Exception {

		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 구매취소할 농산물 이름도 받음. 없는 번호를 선택하면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고, 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체를 fc의 removeFarm()으로 넘기고 전달받은 반환 값이 true면 "구매 취소에 성공하였습니다." false면
		 * "구매 목록에 존재하지 않습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 */

		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("취소 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("구매 취소할 것 : ");
		String name = sc.nextLine();

		String kind = null;
		switch (select) {

		case 1:
			kind = "과일";
			break;

		case 2:
			kind = "채소";
			break;

		case 3:
			kind = "견과";
			break;
		}

		Farm f = new Farm();

		f.setKind(kind);
		f.setName(name);

		if (fc.removeFarm(f) == true) {
			System.out.println("구매 취소에 성공하였습니다.");
		} else
			System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
	}

	public void printBuyFarm() {

		fc.printBuyFarm();
		// fc의 printBuyFarm()의 반환 값을 이용하여 출력

	}

}