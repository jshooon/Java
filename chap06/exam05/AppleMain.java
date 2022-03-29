/*
 파일이름 : AppleMain.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 08(화)
 프로그램 설명 : AppleMain 프로그램에 대한 실습 내용.
 */
package exam05;

public class AppleMain {
	public static void main(String[] args) {
		Mart e_mart = new Mart(0, 100, 1000);
		Buyer mother = new Buyer(100000);
		
		mother.buyerApple(5000, e_mart);
		mother.buyerApple(2000, e_mart);
		
		mother.showBuyer();
		e_mart.showSeller();
		
//		System.out.println(e_mart.benefit); // error, private로 선언했기 때문에 오류.
		System.out.println(mother.myMoney); // error가 아닌 이유는 default로 선언 했기 때문에 오류X.
	}

}
