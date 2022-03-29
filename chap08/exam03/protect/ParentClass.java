/*
 파일이름 : ParentClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(protected접근지시제어자)에 대한 실습 내용.
 */
package exam03.protect;
public class ParentClass {
	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public ParentClass(int num1, int num2, int num3, int num4){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int getnum1() {
		return num1;
	}
	public int getnum2() {
		return num2;
	}
}
