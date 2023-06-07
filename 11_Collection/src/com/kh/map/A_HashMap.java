package com.kh.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.map.model.Snack;

public class A_HashMap {

	public static void main(String[] args) {

		/*
		 * Map - key-value 쌍으로 저장 - 순서 없음 - 중복 : 값(value) o, 키(key) X
		 *
		 * HashMap - Map 인터페이스를 구현한 대표적인 컬렉션 클래스
		 */

		A_HashMap a = new A_HashMap();

		a.method3();

	}

	public void method1() {
		Map<String, Integer> map = new HashMap();

		map.put("김도마", 100);
		map.put("김종휘", 85);
		map.put("구관원", 90);
		map.put("윤종빈", 90);
		System.out.println(map);

		// 1. 키만 가져오기 keySet();
		Set<String> key = map.keySet();

		// 2. 밸류만 가져오기 values();
		Collection<Integer> values = map.values();

		System.out.println(values);
		// 3. 키에 해당하는 value값 가져오기
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name + " : " + map.get(name));
		}
		// 4. entrySet() 메서드 엔트리 개체
//			-entrySet()메서드는 Map컬렉션에 있는 Entry(키랑 벨류를 가진) 객체를 Set에 담아 반환한다.)
		Set<Entry<String, Integer>> entryset = map.entrySet();
		System.out.println(entryset);

	}

	public void method2() {

		Map<String, Integer> map = new HashMap();
		Set<String> key = map.keySet();
		Collection<Integer> values = map.values();

		int sum = 0;
		int max = 0;
		int min = 0;

		map.put("김도마", 100);
		map.put("김종휘", 85);
		map.put("구관원", 90);
		map.put("윤종빈", 90);

		for (Integer integer : values) {
			sum += integer;

			if (max < integer) {
				max = integer;

			}
			if (min == 0) {
				min = integer;
			} else if (min > integer) {
				min = integer;

			}
		}
		int divide = sum / map.size();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + divide);
		System.out.println("체고점수 : " + max);
		System.out.println("채소점수 : " + min);

	}

	public void method3() {
		Map<String, Snack> map = new HashMap<>();

		map.put("웨하스", new Snack("치즈", 240));
		map.put("웨하스", new Snack("딸기", 255));
		map.put("고래밥", new Snack("양념치킨맛", 173));
		map.put("자유시간", new Snack("아몬드", 232));
		map.put("칸쵸", new Snack("딸기 요거트", 880));
		map.put("홈런볼", new Snack("초코", 270));
		map.put("스윙칩", new Snack("볶음고추맛", 347));
		map.put("나쵸", new Snack("치즈", 486));
		map.put("꼬깔콘", new Snack("매콤달콤", 175));
		map.put("후렌치파이", new Snack("딸기", 900));
		System.out.println(map);
		// 키에 해당하는 벨류 가져오기
		Snack snack = map.get("웨하스");
		System.out.println(snack);
		// 키에 해당하는 엔트리개체 삭제하기
		map.remove("꼬깔콘");
		System.out.println(snack);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println("------------------------------------------");

		System.out.println(map.get("홈런볼"));
		System.out.println(map.get("후렌치파이").getFlavor());
		Set<String> key = map.keySet();
		Collection<Snack> co = map.values();

		int sum = 0;
		int evr = 0;
		int count = 0;
		for (Snack snack2 : co) {
			if (snack2.getFlavor().contains("딸기")) {
				sum += snack2.getCalorie();
				count++;
			}
		}
		evr = sum / count;
		System.out.println(count);
		System.out.println("평균 :" + evr);

		System.out.println("------------------------------------------");
	}

	public void method4() {

	}
}
