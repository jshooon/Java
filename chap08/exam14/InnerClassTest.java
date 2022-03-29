/*
 파일이름 : InnerClassTest.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 객체지향(InnerClassTest)에 대한 실습 내용.
 */
package exam14;

public class InnerClassTest {
	public static void main(String[] args) {
		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		
		OuterClass.InnerClass inner1 = outer1.new InnerClass();	// 아우터1에 종속관계
		OuterClass.InnerClass inner2 = outer1.new InnerClass();	// 아우터1에 종속관계
		OuterClass.InnerClass inner3 = outer2.new InnerClass(); // 아우터2에 종속관계
		OuterClass.InnerClass inner4 = outer2.new InnerClass(); // 아우터2에 종속관계
		
	}

}
