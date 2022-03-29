/*
 파일이름 : UseSingleton.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.util.package(상속관계)사용법에 대한 실습 내용.
 */
package exam09;

class CalendarExam{
	private static CalendarExam instance = new CalendarExam();
	public CalendarExam() {}
	
	public static CalendarExam getInstance() {
		return instance;
	}
}
//Singleton : 하나의 참조자료형을 미리생성하여
//메소드로 주소값을 반환하여 그 주소값의 참조자료형을 공유하는 법.
public class UseSingleton {
	public static void main(String[] args) {
		CalendarExam calendar1 = CalendarExam.getInstance(); 
	}
}
