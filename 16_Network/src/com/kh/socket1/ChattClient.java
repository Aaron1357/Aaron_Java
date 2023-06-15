package com.kh.socket1;

import java.net.*;

import java.io.*;

public class ChattClient {

	public static void main(String[] args) {

//		키보드로 입력받은 데이터를 읽어서 서버로 출력하는 클라이언트 측 로직

		try {
//		    1. 소켓생성
			Socket s = new Socket("127.0.0.1", 60000);
			System.out.println("소켓 생성중");
//			2. 스트림생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			String line = "";
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		} catch (IOException e) {
			System.out.println("연결이 끊옂ㅆ습니다");
		}

	}
}
