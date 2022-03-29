/*
 파일이름 : AddressBook.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 16(수)
 프로그램 설명 : AddressBook에 대한 실습 내용.
 */
package exam07;

public class AddressBook {
	/*
	 * 문제) 고등학교/대학교 친구 주소록 관리 프로그램.
	 *       - 고등학교 친구 : 이름/폰번호/주소/직업.
	 *       - 대학교 친구 : 이름/폰번호/주소/전공.
	 *       
	 *       키보드로부터 입력 받아 저장하고,
	 *       사용자의 요청시 데이터를 출력하는 기능을 구현하세요.
	 */

	public static void main(String[] args) {
		Menu menu = new Menu();
		//FriendController controller = new FriendController();
		
		menu.displayMenu();
		
	}
}
