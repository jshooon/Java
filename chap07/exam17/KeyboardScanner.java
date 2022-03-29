/*
 파일이름 : KeyboardScanner.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : KeyboardScanner 입력방법에 대한 실습 내용.
 */
package exam17;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("덧셈 연산 수행 프로그램.");
		
		System.out.print("첫번째 정수값 입력 : ");
		int num1 = keyboard.nextInt(); // 키보드로 입력받길 대기 중.
		
		
		System.out.print("두번째 정수값 입력 : ");
		int num2 = keyboard.nextInt(); // 키보드로 입력받길 대기 중.
		
		
		// System.out.printf("%d, %d\n", num1,num2);
		
		int sum = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		
		keyboard.nextLine();
		
		System.out.printf("당신의 이름은?");
		String name = keyboard.nextLine();
		
		System.out.printf("당신의 이름은 %s이군요.\n", name);
		

	}

}
