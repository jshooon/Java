/*
 파일이름 : AppleMain.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 08(화)
 프로그램 설명 : AppleMain 프로그램에 대한 실습 내용.
 */
package exam04;

public class AppleMain {
	public static void main(String[] args) {
		Mart e_mart = new Mart(0, 100, 1000);
		Buyer mother = new Buyer(100000);
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(2000, e_mart);
		
		mother.showBuyer();
		e_mart.showSeller();
		
		//e_mart = null; // 메모리 소멸. 주소값을 null로 초기화
						 // 더이상 위의 인스턴스를 쓰지 않는다는 뜻.
	}

}
