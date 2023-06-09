package com.kh.lambda.practice;

/* 람다식(Lambda Expressions)
*
* - 자바에서 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원. 런타임 시에는 인터페이스의 익명 구현객체를 생성
* - 람다식을 사용하면 코드가 간결해지고, 컬렉션의 요소들을 필터링하거나 매핑해서 원하는 결과를 쉽게 가져올 수 있음
* - 함수 이름이 없는 익명 함수 (자바스크립트에서는 화살표 함수)
*/


@FunctionalInterface

public interface MathInterface {


	public int calc(int a , int b);
	
}
