package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattSever {

	//클라이언트가 보낸 메세지를받아서
	// 다시 클라이언트에게 받은 메세지를 보낸다.

	public static void main(String[] args) {
//	 서버 생성
		
		try {
			ServerSocket server = new ServerSocket(60000);
			System.out.println("서버 대기중");
	        Socket socket = server.accept();
	        System.out.println("소켓 대기중");
	        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
	        String line = null;
	       
	       
			while((line = br.readLine()) != null) {
				System.out.println("클라이언트가 보낸 메시지 : " + line);
                pw.println(line);		
				
			}socket.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
