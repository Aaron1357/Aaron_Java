package com.kh.practice1;
import java.util.Scanner;

import com.kh.practice1.model.*;
public class Run {
 static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		Member person1 = new Member();
        System.out.println("이름을 입력하세용");	
        String nameInPut = sc.nextLine();
		
		person1.changeName(nameInPut);
		person1.printName();
		
		
		
	}
}
