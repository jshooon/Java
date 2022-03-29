/*
파일 이름 : CharType.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : CharType에 대한 실습 내용.
*/
package exam04;

public class CharType {
	public static void main(String[] args) {
		char alphabet, hangeul;
		int unicode;
		
		alphabet = 'A';
		unicode = alphabet;
		
		System.out.println(alphabet);
		System.out.println(unicode);
		
		hangeul = '한';
		unicode = hangeul;
		
		System.out.println(hangeul);
		System.out.println(unicode);
	}

}
