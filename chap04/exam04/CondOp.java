/*
파일 이름 : CondOp.java
작 성 자 : 지 성훈
작 성 일 : 2022. 02. 03.(목)
프로그램 설명 : CondOp에 대한 실습 내용.
*/
package exam04;

public class CondOp {

	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big = 0, diff = 0;
		
		if(num1 > num2) {
			System.out.println("num1이 num2보다 크다.");
			big = num1;
			diff = num1 - num2;
		}else {
			System.out.println("num1이 num2보다 작다.");
			big = num2;
			diff = num2 - num1;
		}
		System.out.println("큰 값 : " + big + ", 두 값의 차 : " + diff);
		
		// 삼항연산자
		big = (num1 > num2) ? num1 : num2 ;
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1); 
	}

}
