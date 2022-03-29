/*
 파일이름 : AbstractInterface.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 상속(AbstractInterface)에 대한 실습 내용.
 */
package exam11;

public class AbstractInterface {

	public static void main(String[] args) {
		
		
		//UI 기능 구현 ...
		System.out.println("이름/생년월일 입력 화면.");
		
		
		
		PersonalStorage person = new PersonalStorageThirdparty(100);
		
		person.addPersonalInfo("지성훈", "19910329");
		person.addPersonalInfo("김하림", "19900727");
		
		
		String name = person.searchName("19910329");
		
		System.out.println(name);
	}

}
