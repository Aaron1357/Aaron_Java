package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {

	// 키보드로 입력받은 데티어틀ㄹ 읽어서 서버로 보낸다
//다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다.
	public static void main(String[] args) {

		try {
//		    1. 소켓생성
			Socket s = new Socket("127.0.0.1", 60000);
			System.out.println("소켓 생성중");
//			2. 스트림생성
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = "";

			while ((line = br.readLine()) != null) {
				String line2 = "";
				pw.println(line);
				line2 = br2.readLine();
				System.out.println(line2);
			}
			s.close();
		} catch (IOException e) {
			System.out.println("연결이 끊어졌습니다");
		}

	}
}
