/*
 파일이름 : AddressBook.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 16(수)
 프로그램 설명 : AddressBook에 대한 실습 내용.
 */
package exam08;

import java.util.Scanner;

class FriendController {
	
	Friend[] friend;
	final private int MAX_FRIEND;
	private int indexOfFriend;
		
	FriendController(){
		MAX_FRIEND = 300;
		indexOfFriend = 0;
		friend = new Friend[MAX_FRIEND];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null;
		String work = null, major = null, marry = null;
		
		System.out.print("이름을 입력하세요:");
		name = input.nextLine();
		
		System.out.print("전화번호를 입력하세요:");
		phone = input.nextLine();
		
		System.out.print("주소를 입력하세요:");
		address = input.nextLine();
		
		if(choice == 1) {
			System.out.print("결혼여부를 입력하세요:");
			marry = input.nextLine();
			
			friend[indexOfFriend++] = new MiddleFriend(name, phone, address, marry);
			//indexOfHigh++;
			
		}else if(choice == 2) {
			System.out.print("직업을 입력하세요:");
			work = input.nextLine();
			
			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);
		}else if(choice == 3){
			System.out.print("전공을 입력하세요:");
			major = input.nextLine();
			
			friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);
		}
	}
	
	public void displayFriendInfo() {
		for(int i=0; i < indexOfFriend; i++) {
			friend[i].displayFriendInfo();
			/*
			if(friend[i] instanceof HighFriend) {
				HighFriend highFriend = (HighFriend)friend[i];
				highFriend.disdplayHighFriendInfo();
			}else if(friend[i] instanceof UnivFriend) {
				UnivFriend univFriend = (UnivFriend)friend[i];
				univFriend.displayUnivFriendInfo();
			}*/
			
			System.out.println();
		}
	}
}



















