package com.kh.example.practice5;

import java.util.*;
import com.kh.example.practice5.comtroller.*;
import com.kh.example.practice5.model.*;

public class Application {

	EmployeeController employeeController = new EmployeeController();
	Employee employee = new Employee();
	Scanner sc = new Scanner(System.in);

	// ----------------------메인------------------//
	public static void main(String[] args) {

		Application application = new Application();

		boolean loof = true;
		while (loof == true) {

			switch (application.employeeMenu()) { // 조건문(메서드)는 자동실행

			case 1:
				application.insertEmp();
				break;
			case 2:
				application.updateEmp();
				break;
			case 3:
				application.printEmp();
				break;
			case 9:
				System.out.println("종료");
				loof = false ; break;
			}

		}

	}
	// ---------------------메서드----------------//

	public int employeeMenu() {
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 종료");
		int choiceMenu = Integer.parseInt(sc.nextLine());

		return choiceMenu; // 메뉴 번호 리턴!
	}

	public void insertEmp() {

		// ----------정보입력------------//
		System.out.println("사원 번호: ");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("사원 이름: ");
		String name = sc.nextLine();
		System.out.println("사원 성별: ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("전화 번호: ");
		String phone = sc.nextLine();
		employeeController.add(empNo, name, gender, phone);
		System.out.println("추가 정보를 더 입력하시겠습니까? (Y/N)");
		String check = sc.nextLine();

		/// --------------추가 정보칸 -----------//

		if (check.equals("Y")) {
			System.out.println("사원 부서: ");
			String dept = sc.nextLine();
			System.out.println("사원 연봉: ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.println("보너스율: ");
			int bonus = Integer.parseInt(sc.nextLine());
			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
			System.out.println("저장이 완료되었습니다");

		} else if (check.equals("N")) {
			System.out.println("저장이 완료되었습니다");

		} else
			System.out.println("잘못입력하셨습니다. ");

	}

	public void updateEmp() {
		System.out.println("수정할 항목의 번호를 입력하세요");
		System.out.println("1.전화번호");
		System.out.println("2.연봉");
		System.out.println("3.보너스율");
		int check = Integer.parseInt(sc.nextLine());
		switch (check) {

		case 1:
			System.out.println("수정할 번호를 입력하세요");
			String phone = sc.nextLine();
			employeeController.modify(phone);
			System.out.println("수정이 완료되었습니다.");
			break;
		case 2:
			System.out.println("수정할 연봉을 적어주세요 ");
			int salary = Integer.parseInt(sc.nextLine());
			employeeController.modify(salary);
			System.out.println("수정이 완료되었습니다.");
			break;
		case 3:
			System.out.println("수정할 보너스율을 적어주세요");
			double bonus = Double.parseDouble(sc.nextLine());
			employeeController.modify(bonus);
			System.out.println("수정이 완료되었습니다.");
			break;
		}

	}

	public void printEmp() {

		System.out.println(employeeController.info());

	}

}
