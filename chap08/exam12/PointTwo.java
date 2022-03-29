/*
 파일이름 : PointTwo.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 상속(InterfaceMark)에 대한 실습 내용.
 */
package exam12;

class PointTwo implements UpperCasePrintable{
	private int xPos;
	private int yPos;
	
	PointTwo(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	@Override
	public String toString() {
		String posInfo = "(x pos : " + xPos + ", y pos : " + yPos + ")";
		return posInfo;
		
	}
}
