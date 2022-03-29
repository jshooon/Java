/*
 파일이름 : RandomNumberGenerator.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.util.package사용법에 대한 실습 내용.
 */
package exam11;

import java.util.Random;

public class RandomNumberGeneration {
	public static void main(String[] args) {
		Random random = new Random();
		
		int num = random.nextInt(100) + 1; // 0부터 시작이기때문에 최소값이 1부터 시작하기 위하여 +1
		System.out.println("1~100 사이의 임의의 값 : " + num);
		
		double num2 = random.nextDouble();
		System.out.println("0.0 ~ 1.0 사이의 임의의 실수 값 : " + num2);
		
		boolean num3 = random.nextBoolean();
		System.out.println("임의의 논리 값 : " + num3);
	}
}
