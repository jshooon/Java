/*
 파일이름 : ReceiverThread.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class ReceiverThread extends Thread{
	Socket socket;
	
	ReceiverThread(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			
			BufferedReader reader
				= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String msg = reader.readLine();
				
				if(msg != null) {
					System.out.println(msg);
				}
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
}
