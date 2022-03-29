/*
파일 이름 : BitShiftOp.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 28.(금)
프로그램 설명 : BitShiftOp에 대한 실습 내용.
*/
package exam09;

public class BitShiftOp { // 비트시프트연산자
	public static void main(String[] args) {
		byte num = 2;
		System.out.println(num << 1); // 왼쪽에 있는 변수의 비트 값을 기호 방향으로 1칸 이동시키라는연산.
		System.out.println(num << 2); // 왼쪽에 있는 변수의 비트 값을 기호 방향으로 2칸 이동시키라는연산.
		System.out.println(num << 3); // 왼쪽에 있는 변수의 비트 값을 기호 방향으로 3칸 이동시키라는연산.
		
		num = 8;
		System.out.println(num >> 1); // 왼쪽에 있는 변수의 비트 값을 기호 방향으로 1칸 이동시키라는연산.
		System.out.println(num >> 2); // 왼쪽에 있는 변수의 비트 값을 기호 방향으로 2칸 이동시키라는연산.
		System.out.println(num >> 3); // 왼쪽에 있는 변수의 비트 값을 기호 방향으로 3칸 이동시키라는연산.

	}
}
