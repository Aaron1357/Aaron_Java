package com.kh.step1;

import com.kh.step1.model.Tv;

public class Application {

	// $ 객체 $

//   실제로 존재하는 것 
//	 사물과 같은 유형적인 것 뿐만 아니라,
//	 개념이나 논리와 같은 무형적인 것도 포함

	// $ 객체 지향 프로그래밍 $

//	  OOP (Objected -Oriented Programming}	
//    프로그램을 개발하는 기법으로 객체들을 만들고
//    이러한 객체들을 연결해서 프로그램을 완성하는 기법
//    객체 지향 프로그래밍 특성을 지원하는 언어를
//    객체 지향 프로그래밍 언어라고 한다.
//	  코드의 재사용성이 높고, 유지보수가 용이하다

	// $ 객체 지향 프로그래밍의 특징 $

//	1. 추상화 : 객체들이 가진 공통의 특성들을 파악하고 불필요한 특성들을 제거하는 과정
//	2. 캡슐화 : 객체의 속성(필드),기능(메서드) 등을 하나로 묶고 실제 구현내용을 감추는 것
//	3. 상속  : 하나의 객체가 가지고 있는 속성(필드)과 기능(메서드)를 다른 객체가 물려받는 것
//	4. 다형성 : 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질

	// $ 클래스 $

//	 객체의 특성(속성,기능)을 정의한 설계도
//   객체의 속성은 필드(변수)를 통해서 정의  /정보/
//	 객체의 기능은 메소드를 통해서 정의     /행위/
//	 접근제한자 예약어 class 클래스명(첫글자는 대문자로 시작) {... 
//   접근제한자 : public , (default) 설정가능
//	 클래스는 : 필드(Field), 메서드(Method), 생성자(Constructor)가 정의한다.
//	 클래스 작성 시 객체 지향 언어의 특징 중 추상화, 캡슐화가 적용되어야 한다.
//   한 클래스에 public class는 하나만 존재 가능
	public static void main(String[] args) {
 
//		$ 객체 생성 $
		
//		클래스명 변수명 = new 클래스명 ();
	  
//		new 연산자를 사용해서 생성
//		new 연산자는 Heap 영역에 객체를 생성하고 객체의 주소값을 반환
//	    객체의 주소값을 참조 타입인 변수에 저장해서 객체 사용
		
		Tv tv1 = new Tv(); // 인스턴스화 : 객체의 구성요소가 다 올라갔다. 속성,기능 등
		System.out.println("Tv의 전원 상태 : " + tv1.power);
		tv1.power();
		System.out.println("Tv의 전원 상태 : " + tv1.power);
		
		System.out.println("Tv의 채널 상태 : " + tv1.channel);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelDown();
		System.out.println("Tv의 채널 상태 : " + tv1.channel);
		
	
	}

}

