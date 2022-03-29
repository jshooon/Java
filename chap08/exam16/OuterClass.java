/*
 파일이름 : OuterClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 객체지향(AnonymousClass)에 대한 실습 내용.
 */
package exam16;

interface Readable{
	public void read();
}

class OuterClass {
	private String name;

	public OuterClass(String name) {
		this.name = name;
	}
	
	public Readable createLocalClassInst(int num) { // 보이지 않지만 int 앞에는 final이 붙어있다. 상수화시킨다.
		
		return new Readable() {

			@Override
			public void read() {
				System.out.println("LocalClass read():" + name);
				System.out.println("num : " + num);
			}
			
		};
	}
	
}
