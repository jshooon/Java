/*
 파일이름 : UseWrapperClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam05;

class Person {
	
}

public class UseWrapperClass {
	public static void main(String[] args) {
		Person person = new Person();
		
		showData(person);
		
		int num = 10;
		showData(num); 
		// WrapperClass : 기본자료형들의 값을 클래스로 감싸주는 클래스라는 뜻.
		// 기본자료형들의 풀네임들은 참조자료형이다 그 참조자료형들을 묶어서 Wrapper Class라 한다.
		Integer intInst = new Integer(10);// 클래스로 감싸겠다는 뜻.
		
		showData(intInst);
	}
							 // Object obj = new Integer(10);
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	
}
