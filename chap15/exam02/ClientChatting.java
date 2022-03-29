/*
 파일이름 : ClientChatting.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam02;

import java.io.IOException;
import java.net.Socket;

public class ClientChatting {
	public static void main(String[] args) {
		String name = "지성훈";
		
		try {
			Socket socket = new Socket("192.168.0.81", 9001); // 고유번호 9001번 지정요청.
			
			Thread sender = new SenderThread(socket, name);
			Thread receiver = new ReceiverThread(socket);
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
