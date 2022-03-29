/*
 파일이름 : Person.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 09(수)
 프로그램 설명 : KeywordThis 사용방법에 대한 실습 내용.
 */
package exam09;

class Person { // 생성자 오버로딩
	private String name;	// 이름
	private int milID;		// 군번
	
	Person(String name, int milID){
		this.name = name;
		this.milID = milID;
	}
	
	Person(String name){
		this.name = name;
		this.milID = 0;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		
		if(milID == 0) {
			System.out.println("군번이 없슴둥.");
		}else {
			System.out.println("군번 : " + milID);
		}
	}
}
