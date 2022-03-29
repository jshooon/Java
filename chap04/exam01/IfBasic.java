/*
파일 이름 : IfBasic.java
작 성 자 : 지 성훈
작 성 일 : 2022. 02. 03.(목)
프로그램 설명 : IfBasic(조건문)에 대한 실습 내용.
*/
package exam01;

public class IfBasic { // 조건문
	public static void main(String[] args) {
		int num1 = 47, num2 = 38;	// 변수 선언 및 초기화
		int result = 0;
		
		result = (num1 * num1 * num2 * num2) / (num1 - num2);

		if(result >= 50000) {
			System.out.println("실행 결과 값이 50000 이상입니다.");
			System.out.println("결과 값 : " + result);
		}
		
		System.out.println("프로그램 종료!_!");
	}
}
