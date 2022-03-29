/*
 파일이름 : StringScanner.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : StringScanner 입력방법에 대한 실습 내용.
 */
package exam16;

import java.util.Scanner;

public class StringScanner {
	public static void main(String[] args) {
		String source = "1 5 7";
		Scanner scanner = new Scanner(source);
		
		int num1 = scanner.nextInt(); // scanner에들어있는 문자열 데이터를 인트형으로 강제형변환을 하여 리턴 한다는 메소드.
		int num2 = scanner.nextInt(); // scanner에들어있는 문자열 데이터를 인트형으로 강제형변환을 하여 리턴 한다는 메소드.
		int num3 = scanner.nextInt(); // scanner에들어있는 문자열 데이터를 인트형으로 강제형변환을 하여 리턴 한다는 메소드.
		int sum = num1 + num2 + num3;
		System.out.printf("문자열에 저장된 num1 = %d, num2 = %d, num3 = %d, sum = %d \n", num1, num2, num3, sum);
	}

}
