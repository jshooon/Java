/*
 파일이름 : Overriding.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(Overriding)에 대한 실습 내용.
 */
package exam04;

class Speaker {
	private int volumeRate;
	
	public void setVolumRate(int vol) {
		this.volumeRate = vol;
	}
	
	public int getVolumRate() {
		return volumeRate;
	}
	
	public void showCurrentState() { // Method Overriding
		System.out.println("볼륨크기 : " + getVolumRate());
	}
}
