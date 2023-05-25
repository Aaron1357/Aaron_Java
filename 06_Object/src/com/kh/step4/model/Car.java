package com.kh.step4.model;

public class Car {

//	$접근제어자$ (access modifier)

//	클래스, 멤버변수, 생성자, 메서드에 사용되며. 외부로부터 접근을 차단
//	private : 같은 클래스 내에서만 접근이 가능
//	default : 같은 패키지 내에서만 접근이 가능
//	protected : 같은 패키지 내에서, 다른 패키지의 자손 클래스에서 접근가능
//	public : 접근제한 X

//	접근제어자를 쓰는 이유

//	외부로부터 데이터를 보호하기 위해
//	외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기위해

	private String color; // 색상
	private String gearType; // 자동 수동
	private int door; // 문

	public String toString() {
		return "색상 : " + "변속기 : " + gearType + "문의 갯수 : " + door;
	}
	
//	$생성자$
//	인스턴스가 생성될 때 마다 호출되는 '인스턴스 초기화 메서드'
//	인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용

//	클래스명(타입 변수명, 타입변수명....)
//	인스턴스 생성시 수행될 코드가 들어감
//	주로 인스턴스 변수의 초기화 코드 작성

//	생성자 작성시 주의점
//	반드시 생성자는 클래스명과 동일해야한다. (대문자로 시작)
//	반환형이 존재하지 않음 (만약 반환형을 사용하면 일반 메서드가 됨)

//	$기본 생성자$

//	매개변수가 없는 생성자
//  클래스에 생성자가 하나도 없으면 자동으로 생성됨
//	생성자가 하나라도 있으면 자동으로 추가 되지않음
	public Car() {
	} // <<이게 기본 생성자
//	} 
//    
	public Car(String color, String gearType) { //<<이게 기본 생성자
		this.color = color;
		this.gearType = gearType;
	}
 
	public Car(String color, String gearType, int door) { //<<이게 기본 생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	} //this : 인스턴스 자신을 가리키는 참조변수
	  //인스턴스의 주소가 저장되어 있음
	 // 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
}
