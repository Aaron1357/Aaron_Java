package com.kh.set;

import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

public class B_TreeSet {

	// TreeSet
//	저장과 동시에 오름차순 정렬
//	HashSet보다 데이터 추가, 삭제에 시간이 더 걸림

	public static void main(String[] args) {

		B_TreeSet b = new B_TreeSet();
		b.method2();

	}

	public void method1() {    //스트링
		Set<String> set = new TreeSet();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키지");
		set.add("김민재");
		set.add("마동석");
		System.out.println(set);
	}
	
	public void method2() { //객체
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("마동석",52));
		set.add(new Person("마동석",52));
		set.add(new Person("이준혁",39));
		set.add(new Person("이준혁",39));
		set.add(new Person("아오키 무네타카",43));
		set.add(new Person("김맨재",44));
		
		System.out.println(set);
	}

}
