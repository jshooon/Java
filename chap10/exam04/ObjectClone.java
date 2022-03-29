/*
 파일이름 : ObjectClone.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam04;

public class ObjectClone {
	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy = null;
		
		System.out.println(org);
		
		try {
			cpy = (Point)org.clone();// clone : org가 가리키는 인스턴스 메모리영역을 
									 		// 그대로 또다른 사용하지않은 메모리에 복사하는 기능.
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		} 
	}
}
