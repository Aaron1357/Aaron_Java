package com.kh.array;

import java.util.*;

public class C_Sorting {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		C_Sorting c = new C_Sorting();

		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		c.method6();
	}

	public void method1() {

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		// 1. 오름차순 정렬 (작>>큰)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int[] copy = arr.clone();

//		2. 내림차순 정렬
		for (int i = 0; i < copy.length; i++) {
			copy[(arr.length - 1) - i] = arr[i];
			System.out.println(Arrays.toString(copy));

		}
//+ " ლ( ╹ ◡ ╹ ლ) "
	}

	public void method2() {

		// 1. 문자 오름차순

		String[] arr = { "사과", "망고", "배", "Orange", "apple", "banana" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		String[] copy = arr.clone();

		// 2.문자 내림차순
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

	public void method3() {

		int[] score = { 79, 88, 91, 44, 100, 55, 95 };

		Arrays.sort(score);

		System.out.println(score[score.length - 1]);

		int[] copy = score.clone();

		for (int i = 0; i < copy.length; i++) {
			copy[(copy.length - 1) - i] = copy[i];
		}
		System.out.println(copy[0]);
	}

	public void method4() {
		// 선택정렬 " ლ( ╹ ◡ ╹ ლ) "
		// 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고
		// 그 다음 작은 데이터를 선택해 앞에서 두번쨰 데이터와 바꾸는 과정을 반복
		// 배열을 전부 탐색해서 최소값을 왼쪽부터 채워나가는 정렬. {데이터 양이 적을때 좋음/ 100개이상 자료부터는 느려짐}

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}

		}
		// 비교주체 비교대상
		// i=0 j=1~9
		// i=1 j=2~9

	}

	public void method5() {
		// 삽입정렬 (๑◕︵◕๑)
		// 동작 원리는 직관적, 선택 정렬에 비해서는 구현난이도가 높음
		// 필요할 때만 위치를 바꾸므로 '데이터가 거의 정렬되어 있을 때' 효율적'

		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		// 비교주체 비교대상
		// i=0 x
		// i=1 i=0
		// i=2 j=0~1
		// i=3 j=0~2
	}

	public void method6() {
		// 버블정렬
		// 인접한 두 수를 비교해서 큰 수를 뒤로 보내는 것이 특징
		// 구현이 쉽다는 장점이 있지만.다른 정렬에 비해 속도가 느리며.
		// 역순으로 정렬할 때 가장 느린 속도를 가짐.
		
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };
		 
		for (int i = arr.length-1; i >= 0 ; i--) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
                          int temp = arr[j];
                          arr[j]= arr[j+1];
                          arr[j+1] = temp;
                         System.out.println(Arrays.toString(arr));
				}
			}
		}
		
	}
}
