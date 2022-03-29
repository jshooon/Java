/*
 파일이름 : ThrowsFromUpperMethod.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 예외처리(ThrowsFromUpperMethod)에 대한 실습 내용.
 */
package exam08;

import java.util.Scanner;

class AgeInputException extends Exception{
	public AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ThrowsFromUpperMethod {
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 : ");
		int age = 0;	//변수초기값 주는것은 습관이 되자.
		try {
			age = callAge();
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("당신의 나이는 " + age + "이군요.");
	}
	
	public static int callAge() throws AgeInputException{
		int age = readAge();
	
		return age;
	}
	
	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age < 0) {
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		
		return age;
	}
}
