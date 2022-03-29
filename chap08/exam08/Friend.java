/*
 파일이름 : AddressBook.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 16(수)
 프로그램 설명 : AddressBook에 대한 실습 내용.
 */
package exam08;

class Friend { // 공통 특징(부모클래스)
	// field
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	Friend(){}
	
	// Constructor
	Friend(String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// Method
	public void displayFriendInfo() {
		System.out.println("이름:" + name);
		System.out.println("폰번호:" + phoneNum);
		System.out.println("주소:" + address);
	}
}
















