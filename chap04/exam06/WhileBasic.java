/*
 파일이름 : WhileBasic.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 03(목)
 프로그램 설명 : while문에 대한 실습 내용.
 */
package exam06;

public class WhileBasic {
	public static void main(String[] args) {
		/* 1 ~ 100의 합은 = ?
		int result = 0;
		
		result = 1+2+3+ ... +99+100;
		System.out.println(result);
		*/
		int num = 1, result = 0;
		
		while(num < 3) {
			
			System.out.println("명령문 실행 : " + num);
			num++; //num += 1;
		}
		
		num = 1;
		result = 0;	
		while(num <= 100) {
			result += num;
//			System.out.println("누적 값 : " + result);
			num++;
	}
		System.out.println("1 ~ 100까지의 합 : " + result);
	}
}