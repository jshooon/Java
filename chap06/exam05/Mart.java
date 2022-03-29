/*
 파일이름 : Mart.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 08(화)
 프로그램 설명 : 접근지시제어에 대한 실습 내용.
 */
package exam05;

class Mart { // 참조자료형 (판매자)
	// 참조자료형에는 아래와 같이 올 수 있다.
	// field 멤버변수
	private int income;					// 이윤
	private int numberApple;			// 잔고 ( 사과 갯수)
	private final int APPLE_PRICE;		// 사과 단가
	
	// constructor 생성자
	Mart(int ic, int nA, int price){
		income = ic;
		numberApple = nA;
		APPLE_PRICE = price;
	}
	// method - 기능/동작(사물), 행위(사람)
	// 사과 판매 행위.
	
	public int saleApple(int cost) {
		int number = 0;
		
		income += cost;
		number = cost / APPLE_PRICE;
		
		numberApple -= number;
		
		return number;
	}
	
	// 정산
	public void showSeller() {
		System.out.println("이윤 : " + income);
		System.out.println("사과 재고 : " + numberApple);
	}
	
}