/*
 파일이름 : Point.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.package(상속관계)사용법에 대한 실습 내용.
 */
package exam04;

class Point implements Cloneable{ // 정보은닉에 의하여 복제를 하려면 명시를 하여야 명시된 
	private int xPos;			  // 자식클래스만 복제하겠다는뜻. 또한 표시를위한 인터페이스로 인해 
	private int yPos;			  // if문으로 들어가 인터페이스가 있으면 복제를 실행해라는
								  // 이름만 가지고 있는 표시용 인터페이스 클래스.
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { // 이 메소드를 호출하면 호출한쪽에서 
																 // try catch 문을 사용해야 한다는 강력한 메세지.
		return super.clone();	//
	}
	
	
	
}
