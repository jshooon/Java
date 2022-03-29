/*
 파일이름 : DoWhileBasic.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 03(목)
 프로그램 설명 : DoWhile문에 대한 실습 내용.
 */
package exam07;

public class DoWhileBasic {
	public static void main(String[] args) {
		int num = 1, result = 0;
		do {
//			System.out.println("카운팅 값 : " + num);
			result += num;
//			System.out.println("누적 값 : " + result);
			num++;
		}while(num <= 100);
		
		System.out.println("1 ~ 100까지의 합 :" +result);
	}

}
