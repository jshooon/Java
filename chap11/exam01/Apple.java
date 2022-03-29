/*
 파일이름 : Apple.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam01;

class Apple {
	int weight;	// 사과의 중량

	Apple(int weight) {
		this.weight = weight;
	}
	
	public void showAppleWeight() {
		System.out.println("사과의 중량 : " + weight);
	}
	
}

class AppleBox{
	Apple item;

	AppleBox() {}
	
	public void store(Apple item) {	// 포장 기능
		this.item = item;
	}
	
	public Apple pullOut() {	// 개봉 기능
		return item;
	}
}