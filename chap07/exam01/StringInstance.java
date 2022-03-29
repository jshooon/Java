/*
 파일이름 : StringInstance.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 10(목)
 프로그램 설명 : StringInstancet에 대한 실습 내용.
 */
package exam01;

public class StringInstance {
	public static void main(String[] args) {
		String hello1 = "안녕하심까"; 
		String hello2 = new String("안녕하심까, 여러분~");
		
		
		
		System.out.println(hello1.length()); // length : 문자열의 개수를 카운팅해준다.
		System.out.println(hello2.length()); // 배열과 같이 자주 쓰임.
		
//		System.out.println(name1);	// 실행이 순차적으로 가지만
									// 변수 선언은 밑에 있기때문에 오류.

//-----------------------------------------------------------------
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		String name3 = "홍길동";
		String name4 = "홍길동";
		
		System.out.println(name1);
		
		if(name1 == name2) {
			System.out.println("동일 인스턴스 참조.");
		}else {
			System.out.println("다른 인스턴스 참조.");
		}
		
		if(name3 == name4) {
			System.out.println("동일 인스턴스 참조.");
		}else {
			System.out.println("다른 인스턴스 참조.");
		}
//-----------------------------------------------------------------		
		
		//String str = "Hello, Java World~~~";
		//length = str.length();
		int length = "Hello, Java World~~~".length(); // 위와 같은 코드
		
		System.out.println(length);
				
		
	}

}