/*
 파일이름 : ThreadUnderstand.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 24(목)
 프로그램 설명 : Thread사용법에 대한 실습 내용.
 */
package exam01;

class SumThread extends Thread{
	String threadName;
	int start, end;
	
	public SumThread(String threadName, int start, int end) {
		this.threadName = threadName;
		this.start = start;
		this.end = end;
	}

	@Override	//main의 역할을 한다 생각하면된다.
	public void run() {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
			System.out.println(threadName);
		}
		System.out.printf("%s => %d ~ %d까지의 합: %d\n",threadName, start, end, sum);
	}
	
	
}

public class ThreadUnderstand {
	public static void main(String[] args) {
		SumThread thread1 = new SumThread("Thread1", 1, 100);
		SumThread thread2 = new SumThread("Thread2", 101, 200);
		
		
		thread1.start();
		thread2.start();
//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		int sum = 0;
		
		for(int i = 1000; i <= 1100; i++) {
			sum += i;
			System.out.println("main");
		}
		System.out.printf("main() 메서드 실행 : 1000 ~ 1100 %d\n", sum);
		
		System.out.println("프로그램 종료.");
	}

}
