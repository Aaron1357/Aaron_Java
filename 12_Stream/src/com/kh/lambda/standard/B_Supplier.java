package com.kh.lambda.standard;

import java.util.function.Supplier;
import java.util.function.*;

public class B_Supplier {
	public static void main(String[] args) {

		B_Supplier b = new B_Supplier();
		b.method1();
		b.method2();
		b.method3();
		
	}

	public void method1() {
		Supplier<String> supplier = () -> "Supplier는 제네릭으로 지정된 타입의 객체를 리턴한다.";
		System.out.println(supplier.get());
	}

	public void method2() {
		BooleanSupplier boolsupplier = () -> true;
		System.out.println(boolsupplier.getAsBoolean());
	}

	public void method3() {
       LongSupplier longsupplier = () -> 12345678901234590L;
       System.out.println(longsupplier.getAsLong());
	}

}