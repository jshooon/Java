/*
파일 이름 : UseVariableNotation.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : UseVariableNotation에 대한 실습 내용.
*/
package exam02;
public class UseVariableNotation {

	public static void main(String[] args) {
		byte num1, num2; // 변수 선언
		//byte num2;	 // 데이터 타입이 같을경우 데이터 타입을 또 작성하고 변수선언을 따로쓰는 것 보단
						 // ,찍고 나란히 쓰는 것이 유용하다.

		//num1 = 250; // error 발생 byte 데이터 타입은 -128~127까지이기 때문.
		num1 = 55; // 초기화 : 변수를 선언하고 최초 데이터를 저장하는 것을 초기화 라한다.
		num2 = 15;
		int total = num1 - num2;
		System.out.println(num1 - num2);
		System.out.println(num1+ " - " +num2+ " = " +(num1 - num2)); // 55 - 15 = 40
		System.out.println(num1+ " - " +num2+ " = " +total ); // 55 - 15 = 40
		
		int num3 = 512, num4 = 250; // 변수 선언과 동시에
									// 데이터 값을 저장 할 수 있다. 
									// 선호하는 방법!
		
		//	00010101 -> 21
		byte num5 = 025;	// 8진수 표기법
		System.out.println(num5);
		
		num5= 0x15;			// 16진수 표기법
		System.out.println(num5);
		
		// 00011110 -> 30
		num5 = 036;
		System.out.println(num5);
		
		num5 = 0x1e;
		System.out.println(num5);
	}
}
