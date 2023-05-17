package com.kh.Operator;

public class C_Arithmetic {

	// $산술 연산자$
	
    // [ + - * / % ] 
	

	
	
	public static void main(String[] args) {
		
	
		C_Arithmetic c = new C_Arithmetic();
		
		c.method1();
		c.method2();
		
	}
	
	
	
		public void method1() {
		
		
	 int n1 = 10;
	 int n2 = 3;
	
	 System.out.println(" n1 + n2 : " + (n1 + n2)); 
	 System.out.println(" n1 - n2 : " + (n1 - n2)); 
	 System.out.println(" n1 * n2 : " + (n1 * n2)); 
	 System.out.println(" n1 / n2 : " + (n1 / n2));
	 System.out.println(" n1 % n2 : " + (n1 % n2)); 
	
	
		
		
	}
		
		public void method2() {
			
			
			 int a = 5;
			 int b = 10;
			 int c = (++a) + b; //16
			 int d = c / a; //2
			 int e = c % a;  //4
			 int f = e++; //4
			 int g = (--b) + (d--); //11
		     int h = 2;
		     int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); //12
		     
		    
				
				
			}
}
