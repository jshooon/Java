/*
 파일이름 : InterfaceMark.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 상속(InterfaceMark)에 대한 실습 내용.
 */
package exam12;

public class InterfaceMark {

	public static void main(String[] args) {
		PointOne pos1 = new PointOne(3, 5);
		PointTwo pos2 = new PointTwo(3, 7);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		
	}

}
