/*
 파일이름 : Orange.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam03;

class Orange {
	int sugarContent; // 당분 함량
	
	Orange(int sugarContent){
		this.sugarContent = sugarContent;
	}
		
	public void showSugarcontent() {
		System.out.println("당분 함량 : " + sugarContent);
	}
}
