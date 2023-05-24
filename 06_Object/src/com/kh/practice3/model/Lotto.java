package com.kh.practice3.model;

import java.util.Arrays;

public class Lotto {

	int[] lotto = new int[6];
	

	public void check() {

	}

	public String information() {
		for (int i = 0; i < lotto.length; i++) {
			double num = (Math.random() * 45 + 1);

			lotto[i] = (int) num;
		                        
	
		
		}
		return Arrays.toString(lotto);
	}
	
		
        
	

}
