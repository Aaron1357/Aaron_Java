package com.kh.file;

import java.io.*;

public class FileReaingTest {

	String fileName = "src/test.txt";
	String outfileName = "src/result.txt";

	public static void main(String[] args) {

		/*
		 * 문자 스트림
		 * 
		 * 문자 데이터를 읽고 출력할 때 사용됩니다. Reader , Writer : 문자 기반 입출력 스트림의 최상위 클래스
		 */

		FileReaingTest f = new FileReaingTest(); // 인스턴스화
		f.fileSave(); // 메서드호출
       f.fileRead();
        f.method1();
f.method2();
	}

	public void fileSave() {
		// try - with -resource문
		// 사용한 리소스를 자동으로 close(); 해줌
		// FileWriter : 파일을 생성하고 데이터를 문자 단위로 저장

		try (FileWriter fw = new FileWriter(fileName,true )) { //true 넣으면 파일에 계속 추

			fw.write("아ㅏㅏㅏㅏㅏㅏㅏ\n");
			fw.write("배고프다 \n");
			fw.write("그만시켜\n");
			fw.flush(); // 자료 출력

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fileRead() {
		// FileReader를 사용해서 파일에서 데이터를 문자단위로 읽어온다.
		try (FileReader fr = new FileReader(fileName)) {

			int data = 0;

			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
  public void method1() {
	//파일에 있는 내용을 읽어서 한 줄 단위로 콘솔에 출력하는 로직
     try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  @SuppressWarnings("resource")
public void method2() {
	  
	  /* BufferedReader, BufferedWriter
	   * : 입출력 효율을 높히기 위해 버퍼를 사용하는 보조 스트림
	   * - 라인 단위로 입출력이 편리
	   * String readLine(): 한 라인만 읽어온다. (BufferedReader 메서드)
	   * void.newLine() : 라인 구분자를 출력합니다. (BufferedWriter 메서드)
	   * 
	   */
	  BufferedReader br = null;
	  BufferedWriter bw = null;
	  
	  try {
		br = new BufferedReader(new FileReader(fileName));
		bw = new BufferedWriter(new FileWriter(outfileName));
		String line = ""; 
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		 try {
			bw.close(); br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	  
  }
  
//파일에 있는 내용을 읽어서 또다른 파일로 출력하는 로직
	public void method3() {
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// Printwriter : 프린터와 유사하게 출력하는 print(), println() 메서드를 가지고 있는 보조 스트림
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			pw = new PrintWriter(new FileWriter(outfileName/*, true*/)/*, true*/);
			
			String line = "";
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
  }
