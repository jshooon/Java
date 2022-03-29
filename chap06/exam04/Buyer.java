/*
 파일이름 : Buyer.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 08(화)
 프로그램 설명 : AppleMain 프로그램에 대한 Buyer객체 실습 내용.
 */
package exam04;

class Buyer {	// 참조자료형(구매자)
	// 참조자료형에는 아래와 같이 올 수 있다.
	// field(속성) 멤버변수
	int myMoney;	// 가진 돈
	int numOfApple;	// 구매한 사과 갯수
	
	
	
	// constructor 생성자
	Buyer(int money){
		myMoney = money;
		numOfApple = 0;
	}
	
	// Method
	// 사과 구매 행위.
	public void buyerApple(int money, Mart mart) {
		
		numOfApple += mart.saleApple(money);
		myMoney -= money;		
	}
	
	// 가계부
	public void showBuyer() {
		System.out.println("구매한 사과 갯수 : " + numOfApple);
		System.out.println("남은 돈 : " + myMoney);
	}
}
