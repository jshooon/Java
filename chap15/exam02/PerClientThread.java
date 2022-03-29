/*
 파일이름 : PerClientThread.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PerClientThread extends Thread{
	static List<PrintWriter> list
		// 리스트는 동기화를 사용하지못하지만 아래와같은 메소드를 사용함으로써 동기화 가능.
		= Collections.synchronizedList(new ArrayList<PrintWriter>()); 
	// 메세지 전달하기전에 또 데이터가 오면 안되기때문에 메세지 전달 끝날때 까지 기다려라는 뜻.
	Socket socket;
	PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		
		try {
			writer = new PrintWriter(socket.getOutputStream()); //클라이언트에게 전송
			list.add(writer);
			
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		String name = null;
		
		try {// 수많은 문자열 주고 받기때문에 버퍼리더 적용.
			BufferedReader reader 		// 문자열에 최적화 된 Reader사용
				= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 문자열의 한라인을 꺼내오는 메소드 readLine메소드
			name = reader.readLine();
			sendAll("# "+ name +"님이 입장하셨습니다.");
			
			while(true) {
				String msg = reader.readLine();
				
				if(msg != null) {
					sendAll(name + "> " +msg);
				}
			}
			
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	private void sendAll(String msg) {
		for(PrintWriter e : list) {
			e.println(msg); 
			e.flush();
		}
	}
	
}












