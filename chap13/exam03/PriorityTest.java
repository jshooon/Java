/*
 파일이름 : PriorityTest.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 24(목)
 프로그램 설명 : Thread사용법에 대한 실습 내용.
 */
package exam03;

class MessageSendingThread extends Thread{
	String message;
	
	MessageSendingThread(String message, int prio) {
		this.message = message;
		setPriority(prio);
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.printf("%s(%d) \n",message, getPriority());
			
			try {
				sleep(1); // dummy코드라 한다. 1000/1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
}

public class PriorityTest {
	public static void main(String[] args) {						// Thread static 상수값이 들어있는 Method 우선순위부여메소드
		MessageSendingThread tr1 = new MessageSendingThread("first", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("second", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
		
	}
}
