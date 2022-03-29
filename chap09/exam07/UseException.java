/*
 파일이름 : UseException.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : 예외처리(UseException)에 대한 실습 내용.
 */
package exam07;

class A extends Object{
	A(){}
}
class B extends Object{
	public void method() {
		A a = new A();
		try {
			a.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class UseException {

	public static void main(String[] args) {

	}

}
