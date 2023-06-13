package com.kh.lang;

import java.util.Arrays;
import java.util.StringTokenizer;

/*  
 * API(Application Programming Interface)
 * -API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스
 * -JAVA에서 API는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음 
 * 	
 * 	java.lang 패키지 
 *  -자바 프로그램의 기본적인 클래스와 인터페이스를 담고 있는 패키지
 *  java.lang 패키지에 있는 클래스와 인터페이스는 Import 없이 사용가능
 */
public class A_String {
	/*
	 * String 클래스 -불변의 클래스 : 객체를 생성하면 변경할 수 없다. -변경이 적고 읽기가 많은 경우에 사용하는 것이 좋다. -new
	 * 없이도 객체를 생성할 수 있는 유일한 객체
	 * 
	 * 
	 */
	public static void main(String[] args) {
		A_String a = new A_String();

		a.method1();
		a.method2();
		a.method3();
		a.method4();
		a.method5();
//		a.method6();

	}

	public void method1() {

//		toString() : 메서드는 String 클래스에서 오버라이딩 
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("str1 == str2 :" + (str1 == str2));
		System.out.println("str2 == str3 :" + (str2 == str3));
		System.out.println("str3 == str4 :" + (str3 == str4));
		System.out.println("================================");
		System.out.println("str1.toString() : " + str1.toString());
		System.out.println("str2.toString() : " + str2.toString());
		System.out.println("str3.toString() : " + str3.toString());
		System.out.println("str4.toString() : " + str4.toString());
//	equals() 메서드는 String 클래스에서 오버라이딩
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		System.out.println("================================");
		System.out.println("str1.hashCode() : " + str1.hashCode());
		System.out.println("str2.hashCode() : " + str2.hashCode());
		System.out.println("str3.hashCode() : " + str3.hashCode());
		System.out.println("str4.hashCode() : " + str4.hashCode());
//	hashCode() 메서드는 String 클래스에서 오버라이딩
		System.out.println("================================");
//    실제 주소값 : System.identityHashCode()
//       객체의 고유한 HashCode를 리턴하는 메서드
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		System.out.println("str4 : " + System.identityHashCode(str4));
	}

	public void method2() {
		/*
		 * String 클래스에서 제공하는 메서드
		 */

		String str = "Hello, World!";
//		 1. charAt(int index)
//		  : char - 전달받은 index 위치의 하나의 문자만 추출해서 리턴

		char ch = str.charAt(3);
		System.out.println(ch);
		System.out.println("================================");

//	     2. concat(String str) : String
//	      : 전달받은 문자열과 원본 문자열을 하나로 합친 새로운 문자열을 생성해서 리턴

		String str2 = str.concat("!!!");
		System.out.println("str2 : " + str2);
		System.out.println("================================");

//        3. substring(int begin Index) : String
//          : 문자열의 beginIndex 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴 
//           substring(int begin Index, int endIndex) : String
//          : 문자열의 beginIndex 위치에서부터 endIndex = 1 까지의 문자열을 새로 생성해서 리턴 

		String str4 = str.substring(6);
		System.out.println("str4 : " + str4);
		String str5 = str.substring(2, 7);
		System.out.println("str5 : " + str5);
//	      4. indexOf(String str) : int
//	       : 전달받은 str의 시작 인덱스를 리턴
//	         indexOf(char ch) : int
//	       : 전달받은 ch의 인덱스를 리턴
//	         (주어진 문자가 포함되어 있지 않으면 -1 리턴)

		int index = str.indexOf("World");
		System.out.println("index : " + index);
		int index2 = str.indexOf('d');
		System.out.println("index2 : " + index2);
		int index3 = str.indexOf('?');
		System.out.println("index3 : " + index3);
		System.out.println("================================");

//	      5. replace(char oldChar, char newChar) :String
//	       : 문자열에서 old 문자를 new 문자로 변경된 새로운 문자열을 생성해서 리턴

		String str6 = str.replace('l', 'c');
		System.out.println("str6 : " + str6);
		System.out.println("================================");

//	      6. toUpperCase() / toLowerCase() : String
//	       : 문자열을 모두 대/소문자로 변경한 새로운 문자열을 생성해서 리턴

		String str7 = str.toUpperCase();
		String str8 = str.toLowerCase();
		System.out.println("str7 : " + str7);
		System.out.println("str8 : " + str8);
		System.out.println("================================");

//	      7. trim() : String 
//	       : 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성해서 리턴
		str = "                        Hello wolrd       ";
		System.out.println("str.trim() : " + str.trim());
		System.out.println("================================");

//	      8. toCharArray(): char[] 
//	       : 문자열의 문자들을 문자 배열에 담아서 해당 배열의 주소값 리턴		  

		str = "Hello wolrd";
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("================================");

//	      9. static valueOf() : String
//	       : 정적 메서드는 매개변수로 입력받는 값들을 문자열로 변경해서 리턴

		String str9 = String.valueOf(true);
		String str10 = String.valueOf(arr);
		String str11 = String.valueOf(3.1415f);
		System.out.println("str9 : " + str9);
		System.out.println("str10 : " + str10);
		System.out.println("str11 : " + str11);
		System.out.println("================================");
	}

	public void method3() {
		/*
		 * StringBuilder & StringBuffer - 가변의 클래스 : 내부의 문자열을 수정할 수 있음 -16개의 문자를 저장할 수 있는
		 * 버퍼가 미리 생성되고, 문자가 저장됨에 따라 자동으로 증가
		 * 
		 * StringBuilder | StringBuffer 차이점 : 동기화가 되느냐 안되느냐 - 멀티 스레드 환경 : StringBuffer를
		 * 권장 - 단일 스레드 환경 : StringBuilder를 권장
		 */

		StringBuilder sbd = new StringBuilder();
		StringBuilder sbd2 = new StringBuilder(30);
		StringBuilder sbd3 = new StringBuilder("Hello");
		StringBuffer sbf = new StringBuffer();
		System.out.println("문자열 길이 :" + sbd.length());
		System.out.println("버퍼의 크기 :" + sbd.capacity());
		System.out.println("문자열 길이 :" + sbd2.length());
		System.out.println("버퍼의 크기 :" + sbd2.capacity());
		System.out.println("문자열 길이 :" + sbd3.length());
		System.out.println("버퍼의 크기 :" + sbd3.capacity());
		System.out.println("================================");
	}

	public void method4() {
		StringBuilder sbd = new StringBuilder("Hello, ");

//		1. append(String str) : StringBuilder 
//		    : 기존 문자열 뒤에 문자열 추가
		sbd.append("World!");
		System.out.println(sbd);
		System.out.println("================================");

//		2. insert(int offset, String str) : StringBuilder
//		    : 문자열의 offset 위치부터 전달받은 문자열 추가
		sbd.insert(1, "eeee");
		System.out.println(sbd);
		System.out.println("================================");

//		3. delete(int start , int end ) : StringBuilder
//		   : start에서 end-1 까지의 인덱스에 해당하는 문자열을 삭제
		sbd.delete(1, 6);
		System.out.println(sbd);
		System.out.println("================================");

//		4. reverse() : StringBuilder
//		  : 문자열의 순서를 역으로 바꾼다.
		sbd.reverse();
		System.out.println(sbd);
		System.out.println("================================");

		StringBuilder sbd2 = new StringBuilder("Java Program");
		// IPA avaJ
		sbd2.delete(4, 12);
		sbd2.append(" API");
		sbd2.reverse();
		System.out.println(sbd2);
		System.out.println("================================");

	}

	public void method5() {
		// 구분자를 이용하여 문자열 분리
		
//		1. String클래스에서 split 메서드를 이용하는 방법
//		    split(String regex) 
//		     :입력받은 구분자로 문자열을 분리해서 문자열의 배열로 담아서 리턴
		
      String str = "Java,Oracal,JDBC,HTML,"
      		+ "CSS,JavaScript,jQuery,"
      		+ "Servlet,JSP,MyBatis,Spring,React"; 
      String[] strArr = str.split(",");
      System.out.println(strArr.length);
      System.out.println("================================");
      
      for (String string : strArr) {
		System.out.println(string);
	
	}
      System.out.println("================================");
      

//        2.String Tokenizer를 이용하는 방법 
//          
//         String Tokenizer
//        - java.uill 패키지에서 제공하는 클래스
//        - 객체 생성 시 생성자로 전달받은 문자열을 구분자를 이용하여 분리
//        - 분리된 최소 단위를 토큰이라고 부른다.
//        
        StringTokenizer st = new StringTokenizer(str,",");
        System.out.println(st.countTokens());
        System.out.println("================================");
        
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        
        
	}

	public void method6() {

	}
}
