package quiz;

import java.util.Scanner;

public class Main {
	private static final char O = 0;

	public static void main(String[] args) {
//
////		Scanner in = new Scanner(System.in);
////
////		int n = in.nextInt();
////
////		for (int i = 0; i < n / 4; i++) {
////
////			System.out.print("long ");
////
////		}
////		System.out.println("int");
////
////	}   -----------5/31---------백준 

		Scanner sc = new Scanner(System.in);
		String ox;
		int count = 0; 
		int prize = 0;
		int temp = 0;
		char s;
		int testnum = Integer.parseInt(sc.nextLine());
        int sum = 0;
		for (int i = 0; i < testnum; i++) { // 5번 반복                  1
			ox = sc.nextLine();
			for (int j = 0; j < ox.length(); j++) { // 50번 반복  1.s= o ,2. s=o
				s = ox.charAt(j);
				for (int k = 0; k < 1; k++) { // 100번 반복 
					if(s == 'O') {      // o를 만나면 prize 는 1씩상승 템트에 저장 
						temp = ++prize; 
						sum += temp;
					}else prize = 0;  //x를 만나면 prize초기화 
				}
				if(s == 'O') {
				  
				}
				}System.out.println( sum);

				}
			}
		

	}


