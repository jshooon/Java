/*
 파일이름 : UseObject.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 17(목)
 프로그램 설명 : 상속(UseObject)에 대한 실습 내용.
 */
package exam09;

//import java.lang.*; // 자동 생성

class Person /* extends Object */{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {	// chap07 exam13 확인.
		return name + "님 환영합니둥.";
	}
	
}


public class UseObject {

	public static void main(String[] args) {
		Person person = new Person("지 성훈");
				// Object x = Person // 다형성.
		System.out.println(person);
		addMethod('u');
//		addMethod(5); // 매개변수엔 char 자료형 데이터 받기로 했는데 int형 데이터를 대입하여 erorr; 
	}
	
	public static void addMethod(char alphabet) {
		
	}
}