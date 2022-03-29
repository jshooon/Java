/*
 파일이름 : KeywordThis.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 09(수)
 프로그램 설명 : KeywordThis 사용방법에 대한 실습 내용.
 */
package exam09;

public class KeywordThis {
	public static void main(String[] args) {
		Person sunghoon = new Person("지 성훈", 20020209);
		Person harim = new Person("김 하림");
		
		sunghoon.showInfo();
		harim.showInfo();
	}

}
