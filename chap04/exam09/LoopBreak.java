/*
 파일이름 : LoopBreak.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 03(목)
 프로그램 설명 : LoopBreak 대한 실습 내용.
 */
package exam09;

public class LoopBreak {
	public static void main(String[] args) {
		System.out.println("1 ~ 100 사이의 (양의) 짝수 값을 출력.");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("");

		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수를 출력.");

		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("");

		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수인 첫 숫자를 출력.");

		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
			if ((i % 5) == 0) {
				System.out.println(i);
				break;

			}
		}
		System.out.println("* 1 ~ 100사이의 (양의) 5의 배수이면서 7의 배수의 첫 숫자를 출력.");

		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
			if(((i % 5) == 0) && ((i % 7) == 0)){
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("");
		System.out.println("* continue 구문");
		
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(((i % 5) != 0) || ((i % 7) != 0)) {
				continue;
			}
			
			count++;
			System.out.println(i);
		}
		
		System.out.println(count);
	}
}
