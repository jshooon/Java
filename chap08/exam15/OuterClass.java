/*
 파일이름 : OuterClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 객체지향(LocalClassTest)에 대한 실습 내용.
 */
package exam15;

interface Readable{
	public void read();
}

class OuterClass {
	private String name;

	public OuterClass(String name) {
		this.name = name;
	}
	
	public Readable createLocalClassInst(int num) { // 보이지 않지만 int 앞에는 final이 붙어있다. 상수화시킨다.
		class LocalClass implements Readable{ // 특정기능이 호출이 되어야 의미를 가지는 오브젝트.
			public void read() {
				System.out.println("LocalClass read() : " + name);
				System.out.println("num + " + num);	// 메소드안의 참조자료형 안에서 매개변수를 참조하는 경우에는 
			}										// final 매개변수 값만 가져올 수 있다. 따라서 소멸되지 않는다.
		}
		Readable localClass =  new LocalClass();
//		localClass.read();
		return localClass;
	}
	
}
