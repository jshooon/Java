/*
 파일이름 : IntroGenericArray.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam05;

public class IntroGenericArray {
	public static void main(String[] args) {
		String[] stArr = {"Hi", "I'm so happy", "java Generic Programming"};
		showArrayData(stArr);
	}

	public static <T> void showArrayData(T[] stArr) {
		for(T e : stArr) { // 정의된 데이터를 처음부터 끝까지 반복실행하려면 인핸스드포문을 사용하는게 좋다. 
			System.out.println(e);
		}
	}
}
