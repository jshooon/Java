/*
파일 이름 : LogicOp.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 27.(목)
프로그램 설명 : LogicOp에 대한 실습 내용.
*/
package exam03;

public class LogicOp { // 논리연산자(&&, ||, !)
	public static void main(String[] args) {
		boolean X1 = false, X2 = false;
		
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println();
		
		X2 = true;
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println();
		
		X1 = true; X2 = false;
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println();
		
		X2 = true;
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println();
		
		System.out.println(!X1);
	}
}
