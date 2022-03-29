/*
 파일이름 : StringToString.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : StringToString에 대한 실습 내용.
 */
package exam13;

class Friend{
	private String name;
	
	Friend(String name){
		this.name = name;
	}
	
	public String toString() {
		return "제 이름은  입니다.";
	}
}

public class StringToString {
	public static void main(String[] args) {
		String name = new String("세종대왕");
		
		System.out.println(name); // 자료형 : String type
		
		Friend friend1 = new Friend("지 성훈");
		Friend friend2 = new Friend("김 하림");
		
		System.out.println(friend1);  // 자료형 : 참조변수
		System.out.println(friend2);
		
	}

}
