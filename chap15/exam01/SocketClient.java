/*
 파일이름 : SocketClient.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args) {
		try {
			// 매개변수1. 내가 요청할 서버컴퓨터 고유IP IP에 localhost라고 쓰면 내컴퓨터의 네트워크에게 전달해달라는 뜻이다.
			//2. 서버컴퓨터에게 자바에게 요청했던 5001번 전달.
			Socket socket = new Socket("192.168.0.16",5001); 
			ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
			outStream.writeUTF("지성훈이 전송");
			outStream.flush(); // flush : 실시간 전송을 위한 메소드.
			
			ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
			String msg = inStream.readUTF();
			System.out.println("서버로부터 전송되어진 메세지" + msg);
			
			inStream.close();
			outStream.close();
			socket.close();
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	}
}
