/*
파일 이름 : PrefixOp.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 28.(금)
프로그램 설명 : PrefixOp에 대한 실습 내용.
*/
package exam06;

public class PrefixOp {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 0, num3 = 0;
		
		num2 = ++num1; // 전위증가연산자(단항연산자) num1 += 1;
		
		System.out.println(num1);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num3 = ++num1 + 10;
		
		System.out.println("num1 = " + num1);
		System.out.println("num3 = " + num3);
		
		--num1; // 전위감소연산자(단항연산자) num1 -= 1;
		
		System.out.println(num1);
	}
}
