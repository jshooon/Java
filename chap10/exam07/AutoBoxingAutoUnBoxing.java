/*
 파일이름 : AutoBoxingAutoUnBoxing.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam07;

public class AutoBoxingAutoUnBoxing {
	public static void main(String[] args) {
//		String name = "홍길동";//new String("홍길동");
//		int num = 10;
		Integer iValue = 10;	// AutoBoxing
		Double dValue = 3.14;	// AutoBoxing
		
		System.out.println(iValue); // AutoUnBoxing
		System.out.println(dValue);	// AutoUnBoxing
		
		iValue = iValue + 10;
		System.out.println(iValue);
	}

}
