/*
 파일이름 : MethodDef.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 03(목)
 프로그램 설명 : MethodDef 대한 실습 내용.
 */
package exam01;

public class MethodDef {
	public static void main(String[] args) {
		// main Method는
		// 1. 프로그램의 시작.
		System.out.println("프로그램의 시작.");

		// 사용자가 정의한 메서드 호출 방법.

		multiple();

		multiple1(6, 8);

		gugudan(3);

		// 2. 프로그램의 종료.
		System.out.println("프로그램의 종료.");
	}

	// 메서드 정의 방법.
	public static void multiple() {
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수를 출력.");

		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	// 메서드 정의 방법.
	public static void multiple1(int n1, int n2) {
		System.out.println();
		System.out.println("* 1 ~ 100사이의 (양의) " + n1 + "의 배수이면서, " + n2 + "의 배수의 출력.");
		for (int i = 1; i <= 100; i++) {
			if (((i % n1) == 0) && ((i % n2) == 0)) {
				System.out.println(i);
			}
		}
	}

	// 메서드 정의 방법.
	public static void gugudan(int num) {
		System.out.println();
		System.out.println("* " + num + "단 출력");
		// 구구단 출력
		for (int i = 1; i < 10; i++) {
//			System.out.println(i);
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
