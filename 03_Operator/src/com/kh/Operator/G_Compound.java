package com.kh.Operator;
import java.util.*;
public class G_Compound {

//	$복합 대입 연산자$
	
//	산술연산자와 대입연산자가 결합 되어있는 형태
//	연산처리 속도가 빨라져, 사용하는걸 권장!

//     += -= /= %=
	
	
	
	public void method1() {
		
	
		int number = 12;
		String str = "Hello";
		
		number += 3;
		System.out.println(number);
		
		number -= 5;
		System.out.println(number);
		
		number *= 6;
		System.out.println(number);
		
		number /= 3;
		System.out.println(number);
		
		number %= 3;
		System.out.println(number);
		
		str += "World";
		System.out.println(str);

	
		
	}
	
	public void method2() {
		
		
		
		
	}
	
	public void method3() {
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		G_Compound g = new G_Compound();
		g.method1();
		g.method2();
		g.method3();
		
		

		
		
	}
}
