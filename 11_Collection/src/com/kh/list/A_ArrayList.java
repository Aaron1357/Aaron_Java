package com.kh.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.kh.list.model.Person;

public class A_ArrayList {

	// 컬렉션 : 자바에서 제공하는 자료구조를 담당하는 프레임워크
	// java.utill 패키지에 컬렉션과 관련된 인터페이스와 클래스들이 포함
	// 컬렉션은 사용하면 데이터 추가, 삭제, 정렬등의 처리가 간단하게 해결되어, 자료구조적 알고리즘을 구현할 필요가 없음

	public static void main(String[] args) {
		A_ArrayList a = new A_ArrayList();
//		 List
//        - 중복 허용
//        - 순서 있음
		a.method1();
		a.method2();
		a.method3();
	}

	public void method1() {

		List list = new ArrayList();

		list.add("김민소");
		list.add("김민수");
		list.add("김준우");
		list.add("김준영");
		list.add("박주영");

		System.out.println(list);

	}

	public void method2() {

//		Generics

//		 컴파일시 타입을 체크해주는 기능
//		 <> 다이아몬드 연산자 사용
//		명시된 타입의 객체만 저장하도록 제한을 두기 위해 사용
//		컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 된다.

		ArrayList<Person> list = new ArrayList();
//	1. add(E e) : 리스트 끝에 추가
		list.add(new Person("전현무", "삼성동", 45));
		list.add(new Person("남궁민", "서울숲", 45));
		list.add(new Person("이시언", "상도", 40));
		list.add(new Person("이제훈", "서울숲", 38)); // list.add(new 어레이명 (매개변수))

//	 2. add(int index, E e) : 인덱스를 지정하며 해당 인덱스에 추가

		list.add(1, new Person("유재석", "압구정", 50));
		list.add(3, new Person("강호동", "압구정", 52));

//	 3. set(int index , E e) : 해당 인덱스의 값을 변경
		list.set(3, new Person("오은영", "강남", 57)); // 수정의 느낌

//	 4. size() : 리스트 안에 몇개의 데이터가 있는지

		System.out.println("사람 수 : " + list.size());

//	 5. remove(int index) : 해당 인덱스 객체 삭제
		System.out.println(list.remove(0));
		System.out.println(list);

//	 6. get(int index) : 해당 인덱스로 객체 가져오기
		System.out.println(list.get(0));

//	 7. sublist(int index, int index) : 추출해서 새로운 list로 반환
		List sub = list.subList(0, 2); // 0, 2면 0하고 1까지 들어감
		System.out.println(sub); // subList는 List로 선언

//	 8. addAll(Collection c): 컬렉션을 통째로 뒤에 추가하는 메서드
		list.addAll(sub);
		System.out.println(list);

//	9. lsEmpty() : 컬렉션이 비어있는지 묻는 메서드
		
		System.out.println("리스트가 비어있는지 :" + list.isEmpty());
		
//   10. list.clear(); : 즉시 삭제
		
		//list.clear();
        // System.out.println(list.isEmpty());
		
		
		
		
		
		
		
//	11. QUiz
		int j = 0;
		int sum = 0;
		String[] temp = new String[list.size()];
		
		for (j = 0; j < list.size(); j++) {
			sum += list.get(j).getAge();
			

		} int avg = sum / list.size(); System.out.println(avg);
		
	    for (int i = 0; i < list.size(); i++) {
			temp[i] = list.get(i).getName();
		
			
		}System.out.println(Arrays.toString(temp));
	    for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getAddr().equals("서울숲")) {
	    	System.out.println(list.get(i));
			}
		}
	    Collections.sort(list);
	    System.out.println(list);
	  
	    
	}
	
	

	public void method3() {
      
//	  1. indexOf(Object o) : 해당 객체가 위치하는 인덱스값 반환	
		ArrayList<String> list = new ArrayList();
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		System.out.println(list.indexOf("apple"));
		
//	 2. Collections.sort(list)  오름차순 정렬 
		Collections.sort(list);
		System.out.println(list);
		
//	 3. Collections.reverse(list)  내림차순 정렬 (까꾸로)
		Collections.reverse(list);
		System.out.println(list);
	}
}
