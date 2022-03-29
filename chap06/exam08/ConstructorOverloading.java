/*
 파일이름 : ConstructorOverloading.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 09(수)
 프로그램 설명 : ConstructorOverloading 사용방법에 대한 실습 내용.
 */
package exam08;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Person sunghoon = new Person("지 성훈", 20220209);
		Person harim = new Person("하림");
		sunghoon.showInfo();
		harim.showInfo();
	}

}
