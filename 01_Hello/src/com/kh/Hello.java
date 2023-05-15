package com.kh;
// 패키지를 만들어서 클래스를 관리하고 저장한다.
// 패키지는 클래스를 유일하게 만들어주는 식별자 역할을 한다.
// 즉 모든 클래스는 하나의 패키지에 속하며, 패키지가 선언되지 않은 클래스는 자동으로 No-named 패키지로~!
// 모든 코드는 반드시 클래스 안에 존재해야 한다
// 서로 관련된 코드는 그룹으로 나누어 별도의 클래스를 구성한다
// 클래스는 클래스들이 모여 하나의 자바프로그램을 구성한다
// 클래스명은 클래스 파일명과 동일해야한다


// 메소드
// 클래스의 기능 (동작)에 해당하는 구현 부분이다
// 해당 메소드 호출 시 메소드의 블럭 안에 해당하는 부분을 실행한다
// 실행메소드 (main)메소드 : 자바 프로그램 실행시 java.exe에 의해 가장 먼저 호출한다.

// 모든 클래스가 main에 포함되는 것은 아니다.
// 하나의 자바 애플리케이션에는 main 메소드를 포함한 클래스가 반드시 하나는 존재해야한다. 

// 규칙
// 1.패키지명 : 소문자로 기입한다. 회사의 도메인 이름으로 패키지를 만든다. 
// 2.클래스명 : 대문자로 시작해야된다. 또한 단어 앞자리마다 대문자로 표기를 한다.
// 3.메소드명 : 소문자로 시작한다. 또한 단어 앞자리마다 대문자로 표기를 한다.

//자바의 특징
//객체지향 프로그램(Object-Oriented Programing, OOP) 언어이다.
//자동으로 메모리를 관리한다.(Garbage Collecton)
//운영체제에 독립적이다.(JVM, Java Virtual Machine)
//네트워크와 분산처리를 지원한다. (Java API)
//멀티 스레드를 지원한다. (Java API)
//동적 로딩을 지원한다.
//JDK > JRE > JVM
//JDK(Java Development Kit) : 자바 개발 도구 = JRE + 실행파일(bin / javac.exe, java.exe 등)
//JRE(Java Runtime Environment) : 자바 실행 환경 = JVM + Java API(lib/src.zip)
//JVM(Java Virtual Machine) : 자바 가상 머신
//자바 프로그램 실행 단계
//확장자가 .java인 소스파일을 작성한다.
//작성된 소스파일을 자바 컴파일러(javac.exe)로 컴파일하여 확장자가 .class인 바이트코드(기계어)로 번역한다.
//번역된 바이트코드(기계어)를 JVM의 자바 인터프리터(java.exe)를 이용해 실행한다.


public class Hello {

	public static void main(String[] args) 
	
	{
		System.out.println("Hello, World");
 
		
	}
	
}


