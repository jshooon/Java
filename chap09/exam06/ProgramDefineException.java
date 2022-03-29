/*
 파일이름 : ProgramDefineException.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 예외처리(ProgramDefineException)에 대한 실습 내용.
 */
package exam06;

import java.util.Scanner;

class AgeInputException extends Exception{
	public AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}
}

public class ProgramDefineException {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요 : ");
		try {
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "이군요.");
		} catch (AgeInputException e) {
			// e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
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
