/*
 파일이름 : Student.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : 상속에 대한 실습 내용.
 */
package exam01;

class Student extends Friend{	// 학생 친구
	private String university;	// 학교 이름
	private String major;		// 전공
	
	Student(String name, String birth, String address, String email, String university, String major){
		super(name, birth, address, email);
		this.university = university;
		this.major = major;
	}
	
	
	public void displayStudentInfo() {
		displayFriendInfo();
		System.out.println("학교이름 : " + university);
		System.out.println("전공 : " + major);
		
	}
}
