/*
 파일이름 : ForBasic.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 03(목)
 프로그램 설명 : For문에 대한 실습 내용.
 */
package exam08;

public class ForBasic {
	public static void main(String[] args) {
		// 1 ~ 100의 합은 = ?
		int result = 0;

		for (int i = 1; i <= 100; i++) {
//			System.out.println("카운팅 값 : " + num);
			result += i;
//			System.out.println("누적 값 : " + result);
		}
		System.out.println("1 ~ 100까지의 합 : " + result);
	}

}
