/*
 파일이름 : LocalVariable.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 04(금)
 프로그램 설명 : LocalVariable 대한 실습 내용.
 */
package exam04;

public class LocalVariable {
	public static void main(String[] args) {
		boolean	scope = true;
//		double result = 0.0; // 변수이름 겹침
//		double num = 3.14; // 변수이름 겹치기 때문에 if else영역 num에러; 
		
		int result = simple(7);
		
		if(scope) {
			int num = 5;
			num++;
			System.out.println(num);
		}else {
			int num = -5;
			num++;
			System.out.println(num);			
		}
//		System.out.println(num); // 메인메소드 영역에 num이없기때문
	}
	
	public static int simple(int num) {
		int result = num * num;
		
		System.out.println("전달된 값 : " + num);
		System.out.println("결과 값 : " + result);
		
		return result;
	}
}
