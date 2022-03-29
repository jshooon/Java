/*
 파일이름 : PersonalStorage.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 상속에 대한 실습 내용.
 */
package exam11;

class Personal{
	private String name;
	private String perNum;
	
	public Personal(String name, String perNum) {
		
		this.name = name;
		this.perNum = perNum;
	}
	
	public String getPerNum() {
		return perNum;
	}
	
	public String getName(){
		return name;
	}
}

// 부모클래스에 있는 추상메소드를 자식클래스에서 메소드 오버라이딩하여 기능을 정의해야한다.
// 그러면서 상속받는다는 extends가 아니라 implements키워드를 사용한다.
//class PersonalStorageThirdparty extends PersonalStorage {
class PersonalStorageThirdparty implements PersonalStorage {
	private Personal[] personArr;
	private int indexPerInfo;
	PersonalStorageThirdparty(int num){
		indexPerInfo = 0;
		personArr = new Personal[num];
	}
	@Override
	public void addPersonalInfo(String name, String perNum) { // 실행될때마다 힙메모리에 인덱스값 증가하며 데이터 저장
		personArr[indexPerInfo++] = new Personal(name, perNum);
		System.out.println("데이터 저장 완료.");
	}

	@Override
	public String searchName(String perNum) {
		for(int i = 0; i < indexPerInfo; i++) {
			if(perNum.compareTo(personArr[i].getPerNum()) == 0) {
				return personArr[i].getName();
			}
		}			//데이터 내용이 같다면, == 0 을 리턴해준다.
		return null;
	}
	
}
