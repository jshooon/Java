/*
 파일이름 : StringEquals.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam03;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Hi my string");
		String str2 = new String("Hi my string");
		String str3 = "Hi my string";
		String str4 = "Hi my string";
		
		if(str1 == str2) {
			System.out.println("인스턴스 값 일치");
		}else {
			System.out.println("인스턴스 값 불일치");
		}
		
		if(str1.equals(str2)) {						  // 오버라이딩하여 문자내용을 비교함.
			System.out.println("문자열의 내용 동일"); // 문자열의 내용을 비교하고자 사용하는 메소드.
		}else {
			System.out.println("문자열의 내용 동일하지 않음");
		}
		
		if(str3 == str4) {
			System.out.println("인스턴스 값 일치");
		}else {
			System.out.println("인스턴스 값 불일치");
		}
	}
}
