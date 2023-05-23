package com.kh.array;
import java.util.*;

public class D_String {
 
	public static void main(String[] args) {
		D_String d = new D_String();
		d.method1();
		
		// 문자열 
		// 문자의 배열 여러 개의 문자가 배열을 이룬 것이 문자열
		// ' ' , " " 를 사용하여 문자와 문자열을 나타냄
		
//		- $ String.charAt(int index) $
//		 : 인덱스에 있는 문자를 char 형식으로 반환한다.
		
//		-$ String.toCharArray() $
//		: 모든 문자가 들어 있는 char[] 형식의 데이터를 반환
		
		
		
	}  
	
	public void method1() {
		
		char[]arr = "Hello , World ! ".toCharArray();
		for (char c : arr) {
			System.out.println(c);
		}
	}
	