/*
파일 이름 : If_ElseIf_Else.java
작 성 자 : 지 성훈
작 성 일 : 2022. 02. 03.(목)
프로그램 설명 : If_ElseIf_Else(조건문)에 대한 실습 내용.
*/
package exam03;

public class If_ElseIf_Else {
	public static void main(String[] args) {
		int birth = 1991;
		int age = 2022 - birth + 1;; // 변수선언 값은 어떤 연산이든 최종 결과값이 정수값 이기만하면 된다.
		
		System.out.println("당신의 나이는 : " + age + "살 이군요.");
		
		if(age < 10) {
			System.out.println("10대 미만이네요.");
		}else if(age < 20) { // 10 <= age < 20
			System.out.println("10대 이네요.");				
		}else if(age < 30) { // 20 <= age < 30
			System.out.println("20대 이네요.");
		}else {
			System.out.println("30대 이상이군요.");
		}
		System.out.println("프로그램 종료!_!");
	}
}
