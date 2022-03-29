/*
 파일이름 : RuntimeExceptionCase.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 예외처리(RuntimeExceptionCase)에 대한 실습 내용.
 */
package exam03;

public class RuntimeExceptionCase {
	public static void main(String[] args) {

		try {
			int[] arr = new int[3];
			arr[-1] = 20;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());	
		}	//.getMessage(); :// 자바가 정의한 예외에 대한 메세지를 반환해주는 메소드.
		try {
		Object obj = new int[10];
		String str = (String)obj;
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
		try {
		int[] arr = new int[-10];
		}catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}
		try {
		String name = null;
		int length = name.length();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료.");
	}

}
