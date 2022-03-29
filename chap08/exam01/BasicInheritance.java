/*
 파일이름 : BasicInheritance.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : 상속에 대한 실습 내용.
 */
package exam01;

public class BasicInheritance {
	public static void main(String[] args) {
		Student student = new Student("김 하림", "19900727", "서울시 중랑구", "gkfla727@gmail.com", "숭의여대", "관광과");
		
		BusinessMan bMan = new BusinessMan("김 하림", "19900727", "서울시 중랑구", "gkfla727@gmail.com", "라쿠카라차", "기획부", "727");
		
		student.displayStudentInfo();
		System.out.println();
		bMan.displayBusinessManInfo();
		System.out.println();
		student.displayFriendInfo();
	}

}
