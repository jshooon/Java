/*
 파일이름 : AddressBook.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 16(수)
 프로그램 설명 : AddressBook에 대한 실습 내용.
 */
package exam07;

class UnivFriend extends Friend{ // 대학교 친구(자식클래스)
	
	private String major;// 전공
	
	UnivFriend(String name, String phoneNum, String address, String major){
		super(name, phoneNum, address);// 부모 필드(field) 초기화 의무
		this.major = major;
	}
	
	public void displayUnivFriendInfo() {
		displayFriendInfo();
		System.out.println("전공:" + major);
	}

}
