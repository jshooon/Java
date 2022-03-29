/*
 파일이름 : OuterClassOne.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 객체지향(OuterClassOne)에 대한 실습 내용.
 */
package exam13;

class OuterClassOne {
	// field
	NestedClass nst;
	// 생성자
	OuterClassOne() {
		nst = new NestedClass();
		nst.simpleMethod();
	}
	
	
	
	// 메소드
	public void whoAreYou() {
		System.out.println("whoAreYou() 호출 ...");
		// simpleMethod(); // error : 인스턴스 생성이 주소값 저장된 변수로 접근을 하지않아서.
		nst.simpleMethod();
		
	}
	
	
	
	// Nested Class
	static class NestedClass{
		NestedClass(){
			simpleMethod();
//			whoAreYou(); // 인스턴스 생성이 되지 않아서 error
		}
		
		public void simpleMethod() {
			System.out.println("NestedClass => simpleMethod() 호출 ...");
		}
	}
}
