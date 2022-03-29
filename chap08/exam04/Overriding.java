/*
 파일이름 : Overriding.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 15(화)
 프로그램 설명 : 상속(Overriding)에 대한 실습 내용.
 */
package exam04;

public class Overriding {
	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		
		speaker.setVolumRate(5);
		speaker.showCurrentState();
		System.out.println("\n\n=============");
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker();
		baseSpeaker.setVolumRate(8);
		baseSpeaker.setBaseRate(9);
		baseSpeaker.showCurrentState();
		System.out.println("\n\n=============");
		
		Speaker speaker2 = new BaseEnSpeaker(); // 다형성 , 자식의 인스턴스 생성
		
		speaker2.setVolumRate(5);
		System.out.println(speaker2.getVolumRate());
//		speaker2.setBaseRate(7);	// 자신의 자료형영역이 아닌 자식의 자료형영역 메소드를 호출 했기때문에 에러.
		
		speaker2.showCurrentState();
	}
}
