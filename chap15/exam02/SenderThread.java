/*
 파일이름 : SenderThread.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SenderThread extends Thread{
	Socket socket;
	String name;
	
	SenderThread(Socket socket, String name){
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		Scanner input = new Scanner(System.in);
		
		try {
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println(name);
			writer.flush();
			
			while(true) {
				String msg = input.nextLine();
				
				writer.println(msg);
				writer.flush();
				
				if(msg.equals("exit")) {
					break;
				}
			}
			
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
	}
	
	
}
