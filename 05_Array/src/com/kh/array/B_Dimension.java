package com.kh.array;

import java.util.*;

public class B_Dimension {

	private static final String React = null;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		B_Dimension b = new B_Dimension();
		// b.method1();
		// b.method2();
		// b.method3();
		//b.method4();
		b.method5();

//		다차원 배열 : '[]'의 개수가 차원의 수를 의미

//		1. $ 2차원 배열 선언 $
//		
//		자료형[][] 배열명;
//		자료형 배열명 [][];
//		자료형[] 배열명[];
//		
//		2. $ 2차원 배열의 생성 $
//		
//		배열명 = new 자료형[행크기][열크기]
//				
//      3. $ 2차원 배열의 선언과 초기화를 동시에 진행 $
//				
//		자료형[][] 배열명 = new 자료형 [행크기][열크기];
//		자료형 배열명[][]= new 자료형[행크기][열크기]
//	    자료형[]배열명[]= new 자료형[행크기][열크기]
//						
//		4. $배열 변수와 인덱스를 통해 초기화$
//		
//		배열명[0][0]=값;
//		배열명[0][1]=값;
//		배열명[1][0]=값;
	}

	public void method1() {

		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));

		}
	}

	public void method2() {

		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}

		}
	}

	public void method3() {

		int value = 1;
		int[][] arr = new int[3][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);

			}

		}
	}

	public void method4() {

		int[][] arr = { { 1, 1 }, { 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		for (int[] i : arr) { 
			for (int j : i) { 
				System.out.println(j);

			}
		}

	}

	public void method5() {

		String[][] com = new String[][] {{"Java","Oracle","JDBC"},{"HTML","CSS","JavaScript","JQuery"},{"Servlet","JSP","MyBatis"},{"Spring","React"}};
	
        for (int i = 0; i < com.length; i++) {
        	System.out.println(Arrays.toString(com[i]));
        	
        	}
        }
			
		}
	

