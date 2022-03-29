/*
 파일이름 : AddressBook.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 17(목)
 프로그램 설명 : AddressBook에 대한 실습 내용.
 */
package exam10;

class MiddleFriend extends Friend {
	private String marry;
	
	public MiddleFriend(String name, String phoneNum, String address, String marry){
		super(name, phoneNum, address);
		this.marry = marry;
	}
	
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("결혼여부 : " + marry);
	}
	
	public void displayBasicFriendInfo() {
		System.out.println("이름 : " + getName()); // 부모클래스 메소드 호출
		System.out.println("결혼여부 : " + marry);
	}
}
