/*
파일 이름 : CompoundOp.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 27.(목)
프로그램 설명 : CompoundOp에 대한 실습 내용.
*/
package exam04;

public class CompoundOp { // 복합대입연산자
	public static void main(String[] args) {
		int num = 125;
		int result = 0;
		
		num += 50; //num = num + 50; 옆과 같다.
		System.out.println(num);
		
		num -= 50; //num = num - 50; 옆과 같다.
		System.out.println(num);
		
		num *= 50; //num = num * 50; 옆과 같다.
		System.out.println(num);
		
		num /= 50; //num = num / 50; 옆과 같다.
		System.out.println(num);
		
		num %= 50; //num = num % 50; 옆과 같다.
		System.out.println(num);
		
	}
}
