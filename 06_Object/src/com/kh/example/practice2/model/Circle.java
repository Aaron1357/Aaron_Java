package com.kh.example.practice2.model;

public class Circle {

	

	final double PI = 3.14;
	public double radius = 1;
	
	
	
	public double printCN(){
		
		return PI * (radius* radius);
	}
	public double printCD(){
		
		return ((radius*2) * PI);
	}
    public void incrementRadius(){
    	
    	++radius;
    }
	
}
