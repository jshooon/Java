/*
파일 이름 : BitOp.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 28.(금)
프로그램 설명 : BitOp에 대한 실습 내용.
*/
package exam08;

public class BitOp { // 비트(bit)연산자
	public static void main(String[] args) {
		int num1 = 5, num2 = 3;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(~num2);
		System.out.println(num1 ^ num2);

	}
}
