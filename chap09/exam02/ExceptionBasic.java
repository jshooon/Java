/*
 파일이름 : ExceptionBasic.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 예외처리(ExceptionBasic)에 대한 실습 내용.
 */
package exam02;

import java.util.Scanner;

public class ExceptionBasic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나누어지는 수(정수) 입력 : ");
		int num1 = input.nextInt();
	
		System.out.print("나누는 수(정수) 입력 : ");
		int num2 = input.nextInt();
		
		try {
			System.out.println(num1 / num2);
		}catch(ArithmeticException e){	// 자바가 제공하는 ArithmeticException참조자료형과 참조변수 선언.
			System.out.println("나눗셈 불가능...");
		}
		
		System.out.println("프로그램 종료.");
		
	}
}