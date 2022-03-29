/*
 파일이름 : ThreadHeapMultiAccess.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 24(목)
 프로그램 설명 : Thread사용법에 대한 실습 내용.
 */
package exam04;

class Sum{
	int sum;

	Sum() { sum = 0; }
	
	public synchronized void addNum(int num) {
		this.sum += num;
	}
	
	public int getNum() {
		return sum;
	}
}

class AdderThread extends Thread{
	int start, end;
	Sum sumInst;
	
	AdderThread(Sum sum, int start, int end) {
		sumInst = sum;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum sum = new Sum();
		AdderThread at1 = new AdderThread(sum, 1, 5000);
		AdderThread at2 = new AdderThread(sum, 5001, 10000);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1 ~ 10000까지의 합 : " + sum.getNum());
	}
}
