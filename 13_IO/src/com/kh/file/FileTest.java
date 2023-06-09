package com.kh.file;

import java.io.*;

public class FileTest {
	/*
	 * File 클래스 -파일과 디렉토리를 다루는데 사용되는 클래스
	 */
	public static void main(String[] args) {

		// 존재하는 경로까지 지정해 주면 해당 위치에 파일을 생성한다.
		File file = new File("src/test.txt");
		System.out.println("파일명 : " + file.getName());
		System.out.println("절대경로 : " + file.getAbsolutePath());
        System.out.println("상대경로 : " + file.getPath());
        System.out.println("파일용량 : " + file.length());
        System.out.println("존재여부 : " + file.exists());
        System.out.println("파일여부 : " + file.isFile());
        System.out.println("디렉토리 여부 : " + file.isDirectory());
        
        System.out.println();
        
        File newFile = new File("src/camp/test.txt");

		System.out.println("파일명 : " + newFile.getName());
		System.out.println("절대경로 : " + newFile.getAbsolutePath());
        System.out.println("상대경로 : " + newFile.getPath());
        System.out.println("파일용량 : " + newFile.length());
        System.out.println("존재여부 : " + newFile.exists());
        System.out.println("파일여부 : " + newFile.isFile());
        System.out.println("디렉토리 여부 : " + newFile.isDirectory());
        
        //폴더 만들기 
        
        File newFiletemp = new File("src/temp/test.txt");
        File tempD = new File("src/temp");
        tempD.mkdir();
        
        //파일 생성하기 
        try {
			newFiletemp.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}

