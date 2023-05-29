package com.kh.inheritance;
import java.util.*;
import com.kh.inheritance.child.*;

public class Application {
	
	public static void main(String[] args) {
		Notebook notebook = new Notebook("애플","P1234","맥북 프로 14", 2790000, "M2");
		SmartPhone smartphone = new SmartPhone("애플","I1234","아이폰14",1480000,"KT");
		Tv tv = new Tv("삼성","S1234","삼성티비",5000230,27);
	
		System.out.println(notebook);
		
		
		
	}
}
