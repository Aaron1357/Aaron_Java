package com.kh.file;

import java.io.*;

/* 바이트 기반 스트림
*
* - 데이터를 바이트(byte) 단위로 주고 받는다.
* - 그림, 멀티미디어 등의 binary 데이터를 읽고, 출력 할 때 사용
* - InputStream, OutputStream : 바이트 기반 입출력 스트림의 최상위 클래스
*
* 보조 스트림
*
* - 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용
* - 독립적으로 입출력을 수행할 수 없음
*/
public class ByteStreamTest {
	public static void main(String[] args) {

		String fileName = "src/bird.jpg";
		String outfileName = "src/bird_output.jpg";

		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			FileInputStream fis = new FileInputStream(fileName);
			FileOutputStream fos = new FileOutputStream(outfileName);
			dis = new DataInputStream(fis);
			dos = new DataOutputStream(fos);

			int data = 0;
			while ((data = dis.read()) != -1) { //다 읽으면 -1 
				dos.write(data);
			}
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
