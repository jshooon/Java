/*
 파일이름 : Overriding.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(Overriding)에 대한 실습 내용.
 */
package exam04;

class BaseEnSpeaker extends Speaker {
	private int baseRate;
	
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
	
	public int getBaseRate() {
		return baseRate;
	}
	
	public void showCurrentState(){	// Method overriding
		super.showCurrentState();
		System.out.println("베이스 크기 : " + getBaseRate());
	}
}