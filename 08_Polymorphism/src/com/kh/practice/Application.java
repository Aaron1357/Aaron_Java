package com.kh.practice;
import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.*;
import com.kh.polymorphism.controller.*;
import java.util.*;

public class Application {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.mainMenu();
		
		
	}
    public void mainMenu() {
    	System.out.println("이름 :");
    	String name = sc.nextLine();
    	System.out.println("나이 : ");
        int age = Integer.parseInt(sc.nextLine());
        lc.insertMember(name, age);
        
        boolean check = true;
        while(check) {
        	System.out.println("=====메뉴=====");
        	System.out.println("1. 마이페이지");
        	System.out.println("2. 도서 검색하기");
        	System.out.println("3. 도서 대여하기");
        	System.out.println("4. 프로그램 종료하기");
        	System.out.println("메뉴 번호: ");
        int choose = Integer.parseInt(sc.nextLine());
        
        switch(choose) {
        
        case 1: System.out.println(lc.myInfo()); break;
        case 2: this.searchBook(); break;
        case 3: this.rentBook(); break;
        case 4: check = false; break;
        default: System.out.println("잘못 입력하셨습니다"); 
        }
        	
        }
    }
    public void searchBook() {
    	System.out.println("검색할 제목 키워드: ");
        String keyword = sc.nextLine();
        System.out.println(lc.searchBook(keyword));
    	
    }
    public void rentBook() {
    	
    	
    	int count = 0;
    	for (Book a : lc.viewBooks()) {
			System.out.println(count + "번 도서: " + a);
			count++;
		} System.out.println("대여할 도서 번호 선택: ");
		int choose = Integer.parseInt(sc.nextLine());
	
		if(lc.rentBook(choose) == true) {
			System.out.println("나이 제한으로 대여가 불가능합니다");
		}else System.out.println("성공적으로 대여하였습니다.");
		}
		}
		
    	
    

