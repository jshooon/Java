/*
 파일이름 : SoBigInteger.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.math.package사용법에 대한 실습 내용.
 */
package exam12;

import java.math.BigInteger;

public class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("최대정수 : " + Long.MAX_VALUE);
		System.out.println("최소정수 : " + Long.MIN_VALUE);
		
		//long num = 100000000000000000000L; // 수가 넘어서 error;
		
		BigInteger  bigValue1 = new BigInteger("10000000000000000000");
		BigInteger  bigValue2 = new BigInteger("-9999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		System.out.println("큰 수의 덧셈 결과 : " + addResult);
		System.out.println("큰 수의 곱셈 결과 : " + mulResult);
	}

}
