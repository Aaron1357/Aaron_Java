package com.kh.socket1;

import java.io.*;
import java.net.*;

public class ChattServer {

	public static void main(String[] args) {
		try {

//			1. 서버 소켓 생성 (port)
			ServerSocket server = new ServerSocket(60000);
			System.out.println("서버 준비중...");
//		 	2. 클라이언트가 서버에 접속하면 accept 받아서 소켓을 하나 리턴
			Socket s = server.accept();
			System.out.println("소켓 리턴중..");
//			3. 소켓으로부터 스트림 리턴
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println("클라이언트가 보낸 메시지 : " + line);
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("클라이언트와 연결이 끊어졌습니다.");
			 
				
				
			
		}

	}
}
