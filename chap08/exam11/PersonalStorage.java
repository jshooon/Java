/*
 파일이름 : PersonalStorage.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 상속에 대한 실습 내용.
 */
package exam11;

//abstract class PersonalStorage {
interface PersonalStorage{ // 추상메소드로만 구성이 되어 있어야한다.
	//앞에는 public abstract둘다 생략가능하며 따로따로 생략 가능하다.
	//보통 public은 붙여준다. 실무때 생략한걸 만나면 그냥 생략되었다 생각하면된다.
	public /* abstract */ void addPersonalInfo(String name, String perNum);
	public /* abstract */ String searchName(String perName);
}
