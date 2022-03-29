/*
 파일이름 : BusinessMan.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : 상속에 대한 실습 내용.
 */
package exam01;

class BusinessMan extends Friend{	// 회사원 친구
	private String company;			// 회사 이름
	private String department;		// 소속 부서
	private String businessNum;		// 사번
	
	BusinessMan(String name, String birth, String address, String email, String company, String department, String businessNum){
		super(name, birth, address, email);
		this.company = company;
		this.department = department;
		this.businessNum = businessNum;
	}
	public void displayBusinessManInfo() {
		displayFriendInfo();
		System.out.println("사명 : " + company);
		System.out.println("부서 : " + department);
		System.out.println("사번 : " + businessNum);
		
	}
}
