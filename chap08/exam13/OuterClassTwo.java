/*
 파일이름 : OuterClassTwo.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 객체지향(OuterClassTwo)에 대한 실습 내용.
 */
package exam13;

class OuterClassTwo {
	NestedClass nst;
	
	OuterClassTwo(){
		nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private static class NestedClass{
		public void simpleMethod() {
			System.out.println("private NestedClass => simpleMethod() 호출...");
		}
		
	}
}
