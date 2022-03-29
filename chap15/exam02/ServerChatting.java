/*
 파일이름 : ServerChatting.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatting {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			
			while(true) {
				Socket socket = serverSocket.accept();
				Thread person = new PerClientThread(socket);
				person.start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
