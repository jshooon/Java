/*
 파일이름 : ExitReturn.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 04(금)
 프로그램 설명 : ExitReturn 대한 실습 내용.
 */
package exam03;

public class ExitReturn {
	public static void main(String[] args) {
		divide(643, 12);
		divide(63, 12);
		
		divide(643, 0);
		divide(643, 43);
	}
	
	public static void divide(int num1, int num2) {
		int result = 0;
		
		if(num2 == 0) {
			System.out.println("나눗셈은 0으로 나눌 수 없슴둥.");
			return;
		}
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
}
