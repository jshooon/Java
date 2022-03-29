/*
 파일이름 : SoBigDecimal.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.math.package사용법에 대한 실습 내용.
 */
package exam13;

import java.math.BigDecimal;

public class SoBigDecimal {
	public static void main(String[] args) {
		double e1 = 1.6;
		double e2 = 0.1;
		
		System.out.println("두 실 수의 덧셈 결과 : " + (e1 + e2));
		System.out.println("두 실 수의 곱셈 결과 : " + (e1 * e2));
		
		// BigDecimal참조자료형 : 실수의 연산을 오차없이 결과를 내주는 기능.
		BigDecimal e3 = new BigDecimal("1.6"); // 인자값은 String형으로 넣어줘야한다.
		BigDecimal e4 = new BigDecimal("0.1"); // 인자값은 String형으로 넣어줘야한다.
		
		System.out.println("두 실 수의 덧셈 결과 : " + (e3.add(e4)));
		System.out.println("두 실 수의 곱셈 결과 : " + (e3.multiply(e4)));
		
	}
}
