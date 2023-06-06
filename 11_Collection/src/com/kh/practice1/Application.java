package com.kh.practice1;

import java.util.Scanner;
import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public static void main(String[] args) {
		Application ap = new Application();

		ap.mainMenu();

	}

	public void mainMenu() {

		System.out.println("=====메인메뉴=====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.println();
		System.out.println("메뉴번호 입력 : ");

		int choose = Integer.parseInt(sc.nextLine());

		switch (choose) {
		case 1:
			addList();
			mainMenu();
		case 2:
			addAtZero();
			mainMenu();
		case 3:
			printAll();
			mainMenu();
		case 4:
			searchMusic();
			mainMenu();
		case 5:
			removeMusic();
			mainMenu();
		case 6:
			setMusic();
			mainMenu();
		case 7:
			ascTitle();
			mainMenu();
		case 8:
			descArtist();
			mainMenu();
		case 9:
			System.out.println("종료합니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			mainMenu();
		}
	}

	public void addList() {
		Music m = new Music();
		System.out.println("*****마지막 위치에 곡 추가 *****");
		System.out.println("곡을 입력하세요");
		String nameOfSong = sc.nextLine();
		System.out.println("가수를하세요");
		String nameOfArtist = sc.nextLine();

		m.setTitle(nameOfSong);
		m.setArtist(nameOfArtist);

		if (mc.addList(m) == true) {
			System.out.println("추가 성공");
		} else
			System.out.println("추가 실패");

	}

	public void addAtZero() {
		Music m = new Music();
		System.out.println("*****첫 위치에 곡 추가 *****");
		System.out.println("곡을 입력하세요");
		String nameOfSong = sc.nextLine();
		System.out.println("가수를입력 하세요");
		String nameOfArtist = sc.nextLine();

		m.setTitle(nameOfSong);
		m.setArtist(nameOfArtist);

		if (mc.addAteZero(m) == true) {
			System.out.println("추가 성공");
		} else
			System.out.println("추가 실패");

	}

	public void printAll() {
		System.out.println(mc.printAll());
	}

	public void searchMusic() {
		System.out.println("검색 할 곡을 입력하세요");
		String seach = sc.nextLine();
		if (mc.searchMusic(seach) != null) {
			System.out.println(mc.searchMusic(seach) + "을 검색했습니다.");
		} else
			System.out.println("검색한 곡이 없습니다.");

	}

	public void removeMusic() {
		System.out.println("삭제 할 곡을 입력하세요");
		String seach = sc.nextLine();
		Music music = mc.removeMusic(seach);
		if (music != null) {
			System.out.println(music + "을 삭제했습니다.");
		} else
			System.out.println("삭제할 곡이 없습니다.");

	}

	public void setMusic() {
		Music m = new Music();
		System.out.println("수정 할 곡을 입력하세요");
		String search = sc.nextLine();
		
		if (mc.searchMusic(search) != null) {
			System.out.println("수정 할 제목을 입력하세요");
			String title = sc.nextLine();
			System.out.println("수정 할 가수명을 입력하세요");
			String artist = sc.nextLine();
			m.setTitle(title);
			m.setArtist(artist);
			System.out.println(mc.searchMusic(search) + "의 값이 수정되었습니다.");
			if (mc.setMusic(search, m) != null) { //= list.get(i);
			} else
				System.out.println("수정 할 곡이 없습니다.");

		} else
			System.out.println("수정 할 곡이 없습니다.");

	}

	public void ascTitle() {
		System.out.println("****곡명 오름차순 정렬****");
		for (Music music : mc.ascTitle()) {
			System.out.println(music);
		}
	}

	public void descArtist() {
		System.out.println("****가수명 내림차순 정렬****");
		for (Music music : mc.descArtist()) {
			System.out.println(music);

		}
	}

}
