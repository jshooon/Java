/*
 파일이름 : NestedClassTest.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 객체지향(NestedClassTest)에 대한 실습 내용.
 */
package exam13;

public class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		one.whoAreYou(); // 결과 값은 생성자 호출로 인해서다.
//		one.simpleMethod();	//OuterClass 인스턴스가 생성되어도, 
							//NestedClass는 메모리할당이 되지않아서 error
		one.nst.simpleMethod();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
//		new OuterClassTwo.NestedClass(); // private 되어있기 때문에 error
		
	}

}
