/*
 파일이름 : IntroGenericMethod.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam04;

public class IntroGenericMethod {
	public static void main(String[] args) {
		FatherClass father = new FatherClass();
		ChildClass child = new ChildClass();
		
		InstanceTypeShower shower = new InstanceTypeShower();
		
		//shower.<FatherClass>showInstType(father);
		shower.showInstType(father); // 인자값에 참조변수 입력과 동시에 자료형을 알 수 있기 때문에 자료형을 명시하지 않아도 된다.
		shower.<ChildClass>showInstType(child);
		//shower.<FatherClass, ChildClass>showMuliInstType(father, child);
		// 인자값에 참조변수 입력과 동시에 자료형을 알 수 있기 때문에 자료형을 명시하지 않아도 된다.
		shower.showMuliInstType(father, child);
		
		shower.showPrintCnt();
	}
}
