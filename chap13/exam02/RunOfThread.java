/*
 파일이름 : RunOfThread.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 24(목)
 프로그램 설명 : Thread사용법에 대한 실습 내용.
 */
package exam02;

class Sum{
	int sum;

	Sum() { sum = 0; }
	
	public void addNum(int num) {
		this.sum += num;
	}
	
	public int getNum() {
		return sum;
	}
}

class AddThread extends Sum implements Runnable{
	int start, end;
	
	AddThread(int s, int e){
		this.start = s;
		this.end = e;
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			addNum(i);
		}
	}
}

public class RunOfThread {
	public static void main(String[] args) {
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(" 1 ~ 100까지의 합 : " + (at1.getNum() + at2.getNum()));
	}

}
