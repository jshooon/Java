/*
 파일이름 : RandomNumberGenerator.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.util.package사용법에 대한 실습 내용.
 */
package exam10;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random random = new Random(); //기준값을 Seed라 부른다. Seed값을 통일시키면 항상 같은값이 나온다.
		// Seed값을 안넣어주면 아래와같이 실행 된다.
		random.setSeed(System.currentTimeMillis()); // currentTimeMillis 메소드는 실행하는순간 그 시간정보를 1000/1초(0.001)까지 읽어오는 메소드.
													// 1000/1(0.001)초마다 Seed값이 변경 되기 때문에 값이 계속 바뀌게 된다. 따라서 수식으로 표기된 필드값도 다르기때문에 랜덤으로 처리하게끔 구성이 된다.
		for(int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(10));
		}
	}

}
