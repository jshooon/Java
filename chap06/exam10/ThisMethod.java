/*
 파일이름 : ThisMethod.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 09(수)
 프로그램 설명 : ThisMethod 사용방법에 대한 실습 내용.
 */
package exam10;

public class ThisMethod {
	public static void main(String[] args) {
		Person sunghoon = new Person("지 성훈", 20220209, 2000, 9, 5);
		Person harim = new Person("김 하림", 2000, 3);
		sunghoon.showInfo();
		harim.showInfo();

	}

}
