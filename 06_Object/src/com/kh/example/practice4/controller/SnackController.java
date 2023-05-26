package com.kh.example.practice4.controller;
import com.kh.example.practice4.model.*;
public class SnackController {

//  멤버변수  > 보통 모델로 만들어 둔 클래스가 온다.
	Snack snack = new Snack();
//          ^ 컨트롤러에 예속 된 스낵.
	
//	생성자 > 기본생성자
	
	public SnackController() {
	}
	
	
//	메서드 >  
	
	//데이터를 setter를 이용해 저장하고, 저장되어있다는 결과를 반환하는 메서드
	public boolean saveData(Snack viewSnack) {//<<< 런에서 온 스낵 (viewSnack) 
		                   // ^ 컨트롤러에 예속 된 스낵 (snack)
		
	// -----------얘네는 런에서 받은 값을 스낵 컨트롤러에 예속 한 스낵컨트롤러 속 스낵--------
		snack.setKind(viewSnack.getKind());
		snack.setFlavor(viewSnack.getKind());
		snack.setName(viewSnack.getName());
		snack.setNumOf(viewSnack.getNumOf());
		snack.setPrice(viewSnack.getPrice());
	
	
	return true;       
	}
	
	// 컨트롤러에 저장된 데이터를 반환하는 메서드\
	public Snack confirmData() {
//		   ^ 스낵이라는 클래스의 형식 자체가 변환값
		return snack; 
		
	}
}
