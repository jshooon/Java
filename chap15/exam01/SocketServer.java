/*
 파일이름 : SocketServer.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : 채팅프로그램 사용법에 대한 실습 내용.
 */
package exam01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5001); // 자바가 소켓을 만들어준다. 인스턴스생성하여 사용하기만 하면된다.
			// accept();를 실행하면 수행하러가서 클라이언트가 자기한테 요청해올 때까지 대기하고있다가 
			//클라이언트가 소켓정보를 전달하면 받았을때 받은정보를 가지고 리턴하여 복귀한다.
			while(true) {	//채팅 프로그램이기 때문에 무한 반복문을 사용한다.
			Socket socket = serverSocket.accept();
			ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());// 저장된값을 꺼내오기위해 연결 통로를 만들어준다.
			String msg = inStream.readUTF();
			System.out.println("Client가 전송해 온 메세지 : " + msg);
			
			if(msg.equals("exit")) { // 무한반복이기 때문에 멈추는 기능을 설정해준다. Client가 exit를 전달하면 종료.
				serverSocket.close();
				break;
			}
			
			ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream()); // Server Socket에 저장된다. 
			outStream.writeUTF("지성훈 : " + msg); // Client Socket에 연결된다.
			outStream.flush(); // 버퍼에 데이터가 다 쌓이지 않더라도 바로 전달하게끔 하는 메소드.
			
			outStream.close();
			inStream.close();
			socket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //5001번으로 저장한다. 1024번호 이하는 사용하지않는다. 운영체제가 사용하는 토트번호다.
	}
}
