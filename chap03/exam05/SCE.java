/*
파일 이름 : SCE.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 28.(금)
프로그램 설명 : SCE에 대한 실습 내용.
*/
package exam05;

public class SCE { // Short-Circuit Evaluation
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result = false;
		
		num1 += 10;
		num2 += 10;
		result = (num1< 0) && (num2 > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		result = (num1< 0) || (num2 > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}
}