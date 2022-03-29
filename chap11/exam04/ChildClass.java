/*
 파일이름 : ChildClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam04;

class FatherClass{

	@Override
	public String toString() {
		return "class FatherClass";
	}
	
}

class ChildClass {

	@Override
	public String toString() {
		return "class childClass";
	}

}
