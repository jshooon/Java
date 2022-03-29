/*
 파일이름 : AnonymousClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 객체지향(AnonymousClass)에 대한 실습 내용.
 */
package exam16;

public class AnonymousClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass("First");
		
		Readable localClass = outer.createLocalClassInst(494);
		
		localClass.read();
		
		
	}

}
