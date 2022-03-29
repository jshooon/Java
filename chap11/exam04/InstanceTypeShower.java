/*
 파일이름 : InstanceTypeShower.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam04;

class InstanceTypeShower {
	int showCnt;

	InstanceTypeShower() {
		this.showCnt = 0;
	}
	
	// Generic Method반환형 앞에 표시한다.
	public <T> void showInstType(T inst){
		System.out.println(inst);
		showCnt++;
	}
	// 여러개의 자료형을 치환시킬 수 있다.
	public <T, U> void showMuliInstType(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
		showCnt++;
	}
	public void showPrintCnt() {
		System.out.println("메소드 호출 수 : " + showCnt);
	}
}
