/*
 파일이름 : OuterClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 객체지향(InnerClassTest)에 대한 실습 내용.
 */
package exam14;

class OuterClass {
	private String name;
	private int num;
	
	public OuterClass(String name) {
		this.name = name;
		this.num = 0;
		new InnerClass();
	}
	
	public void whoAreYou() {
		num++;
		System.out.println(name + " OuterClass");
	}
	
	class InnerClass{
		InnerClass(){
			whoAreYou();	
		}
	}
	
}
