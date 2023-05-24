package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {
		
		Card card1 = new Card();
		Card card2 = new Card();  //객체생성 (인스턴스화)
		
		card1.kind = "Heart";     //객체생성 필수
		card1.number = 7;
		card2.kind = "Spade";
		card2.number = 3;
		
		//클래스 변수는 인스턴스 생성 없이 호출가능!
      		System.out.println(Card.width);  //Static 변수라서 객체생성 필요없음.
      		System.out.println(Card.heigth);
      		System.out.println("첫번째 카드는 : " +card1.kind+ " " + card1.number + " 이며"+ " 크기는 "+ card1.width + " 높이는 "+ card1.heigth + " 입니다.");
      		System.out.println("첫번째 카드는 : " +card2.kind+ " " + card2.number + " 이며"+ " 크기는 "+ card2.width + " 높이는 "+ card1.heigth + " 입니다.");
      		
	}
}
