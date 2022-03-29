/*
파일 이름 : IntroString.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : IntroString에 대한 실습 내용.
*/
package exam06;

public class IntroString {
	public static void main(String[] args) {
		String hello = "hello, java!!";
		String name = "홍길동";
		
		System.out.println(hello);
		System.out.println(name);
		
		name = "홍";
		System.out.println(name);
		
		name = "";
		System.out.println("이름 : " + name);
		
		int num1 = 0;
		double num2 = 0.0;
		char alphabet = ' ';
		boolean bool = false;
		String string1 = null; //"";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(alphabet);
		System.out.println(bool);
		System.out.println(string1);
	}
}
