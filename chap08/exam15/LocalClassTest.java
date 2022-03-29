/*
 파일이름 : LocalClassTest.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 객체지향(LocalClassTest)에 대한 실습 내용.
 */
package exam15;

public class LocalClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass("First");
		
		
		//인터페이스 클래스 이름.
		Readable localClass = outer.createLocalClassInst(54);	// 코드를 잘 체크해보자.
		localClass.read();										// 코드를 잘 체크해보자.
	}
}
