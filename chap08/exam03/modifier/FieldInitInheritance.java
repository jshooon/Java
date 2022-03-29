/*
 파일이름 : FieldInitInheritance.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(protected접근지시제어자)에 대한 실습 내용.
 */
package exam03.modifier;

import exam03.protect.ParentClass;

class ChildClass extends ParentClass{
	
	
	
	ChildClass(int num1, int num2, int num3, int num4){
		super(num1, num2, num3, num4);
	}
	
	public void ChildMethod() {
//		System.out.println("num1 = " + num1); // 접근불가(private);
//		System.out.println("num2 = " + num2); // 접근불가(default - 다른패키지);
		System.out.println("num3 = " + num3); // 접근가능(protected);
		System.out.println("num4 = " + num4); // 접근가능(public);
	}
}

public class FieldInitInheritance {
	public static void main(String[] args) {
		ChildClass child = new ChildClass(4, 5, 8, 7);
		child.ChildMethod();
		System.out.println("num1 = " + child.getnum1());
		System.out.println("num2 = " + child.getnum2());
		
	}

}
