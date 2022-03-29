/*
파일 이름 : SwitchBreak.java
작 성 자 : 지 성훈
작 성 일 : 2022. 02. 03.(목)
프로그램 설명 : SwitchBreak에 대한 실습 내용.
*/
package exam05;

public class SwitchBreak {
	public static void main(String[] args) {
		int num1 = 3; // 아침/점심/저녁
		String name = "홍길동";

		switch(num1) {
			case 1: 
				System.out.println("정수의 값은 1이에요.");
				System.out.println("Good Morning, Java!");
				break;
			case 2:
				System.out.println("정수의 값은 2이에요.");
				System.out.println("Good Afternoon, Java!");
				break;
			case 3:
				System.out.println("정수의 값은 3이에요.");
				System.out.println("Good Evening, Java!");
				break;
			default:
				System.out.println("정수의 값은 1~3이외의 값이에요.");
				System.out.println("Hello, Java!");
				break;
		}

		switch (name) { // 7버전 이후
		case "김유신":
		case "세종대왕":
		case "홍길동":
			System.out.println("제 이름은 " + name + "입니다.");
			break;
		default:
			System.out.println("이름을 알 수 없습니다.");
			break;
		}
		System.out.println("프로그램 종료~");
	}
}
