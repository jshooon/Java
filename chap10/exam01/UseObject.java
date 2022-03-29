/*
 파일이름 : UseObject.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam01;
class Person extends Object{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "님 환영합니다.";
	}
	
}
public class UseObject {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		
		System.out.println(person);
		
	}
}
