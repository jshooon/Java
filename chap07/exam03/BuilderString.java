/*
 파일이름 : BuilderString.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 10(목)
 프로그램 설명 : BuilderString에 대한 실습 내용.
 */
package exam03;

public class BuilderString {
	public static void main(String[] args) {
//		StringBuilder str = new StringBuilder("Smart"); // 문자열결합 참조자료형
		StringBuffer str = new StringBuffer("Smart");	// 차이점은 쓰레드를 동기화를 공부해야 알 수 있다.
		
//		str.append(" and ");	// append : 문자열 결합기능 메소드
//		str.append(" Simple "); // concat과 다르게 자체 메모리에 추가해준다.
//		str.append(true);		// 순차적으로 적재하면서 결합 시키는 기능.
//		str.append(25);			// append메소드는 오버로딩이 되있어서
//		str.append(3.14);		// 어느 자료형이든 다 쓸 수 있다.
								// 그리고 자체적인 메모리를 가지고 있어, 만들때마다 
								// 문자열을 쓸때마다 메모리할당을 하지않고
								// 자체적인 메모리에 적재한다.
		
		// 위와같은 코드를 아래와 같은 코드로 작성할 수 있다.
		// 이런 코드작성법을 메소드 체인이라 한다.
		str.append(" and ").append("Simple, ").append(true).append(25).append(3.14);
			System.out.println(str);
			
			
		str.insert(22, 22); // 20번째 위치에다가 false값을 삽입 하겠다라는 뜻.
							// insert : 일반적으로 원하는 위치에
							// 문자열데이터를 결합하고 싶을 때 사용하는 메소드다.
		System.out.println(str);
	}

}
