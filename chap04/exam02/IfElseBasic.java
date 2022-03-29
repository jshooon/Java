/*
파일 이름 : IfElseBasic.java
작 성 자 : 지 성훈
작 성 일 : 2022. 02. 03.(목)
프로그램 설명 : IfElseBasic(조건문)에 대한 실습 내용.
*/
package exam02;

public class IfElseBasic {
	public static void main(String[] args) {
		int num = 38;
				
		if((num % 2) == 0) {
			System.out.println("결과 값은 짝수입니다.");
		} else {
			System.out.println("결과 값은 홀수입니다.");
		}
		
		System.out.println("프로그램 종료!_!");
	}
}
