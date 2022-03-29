/*
파일 이름 : UseConstant.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : UseConstant에 대한 실습 내용.
*/
package exam07;

public class UseConstant {
	public static void main(String[] args) {
		// int num = 10000000000; // error int가 가질 수 있는 값의 범위를 초과해서.
			long num1 = 10000000000l;
			float pi = 3.14f;
			
		System.out.println(num1);
		System.out.println(pi);
	}

}
