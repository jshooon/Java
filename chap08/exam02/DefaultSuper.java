/*
 파일이름 : DefaultSuper.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(super키워드)에 대한 실습 내용.
 */
package exam02;

class ParentClass{
	int num1;
	
	ParentClass(int num){ // 
		this.num1 = num;
	}
	
}

class ChildClass extends ParentClass{
	
	ChildClass(int num){
		super(num);
	}
	
}

public class DefaultSuper {
	public static void main(String[] args) {

	}
		
}
