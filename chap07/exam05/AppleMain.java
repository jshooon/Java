/*
 파일이름 : AppleMain.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : AppleMain(배열)에 대한 실습 내용.
 */
package exam05;

public class AppleMain {
	public static void main(String[] args) {
//		Mart e_mart = new Mart(0, 100, 1000);
//		Mart homeplus = new Mart(0, 200, 2000);
//		Mart lotte_mart = new Mart(0, 150, 3000);
//		
//		Buyer mother = new Buyer(100000);
//		Buyer father = new Buyer(50000);
//		Buyer son = new Buyer(10000);
		
		// 위의 인스턴스 코드를 배열로 변경하여 데이터 관리.
		// 각 인스턴스의 주소값을 인덱스에 저장.
		Mart[] mart = new Mart[3];
		
//		for(int i = 0; i < mart.length; i++){ // null값이 초기화값으로 저장 되있다.
//			System.out.println(mart[i]);
//		}
		
		mart[0] = new Mart(0, 100, 1000);
		mart[1] = new Mart(0, 200, 2000);
		mart[2] = new Mart(0, 150, 3000);
		
		for(int i = 0; i < mart.length; i++){
			System.out.println(mart[i]);
		}
		
		Buyer[] buyer = new Buyer[3]; 
		
		buyer[0] = new Buyer(100000);
		buyer[1] = new Buyer(50000);
		buyer[2] = new Buyer(10000);
		
		// 어머니가 홈플러스에 가서 사과 4000원 구매.
		
		buyer[0].buyerApple(4000,mart[1]);
		buyer[0].buyerApple(2000,mart[1]);
		buyer[0].buyerApple(2000,mart[1]);
		
		buyer[0].showBuyer();
		mart[1].showSeller();
		
//		Mart[] mart = {new Mart(0, 100, 1000),new Mart(0, 200, 2000),new Mart(0, 150, 3000)};
	}

}





