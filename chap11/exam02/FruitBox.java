/*
 파일이름 : FruitBox.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam02;

class Apple {
	int weight;	// 사과의 중량

	Apple(int weight) {
		this.weight = weight;
	}
	
	public void showAppleWeight() {
		System.out.println("사과의 중량 : " + weight);
	}
	
}

class Orange {
	int sugarContent; // 당분 함량
	
	Orange(int sugarContent){
		this.sugarContent = sugarContent;
	}
		
	public void showSugarcontent() {
		System.out.println("당분 함량 : " + sugarContent);
	}
}

class FruitBox {
	Object item;
	
	FruitBox(){}
	
	public void store(Object item) {	// 포장
		this.item = item;
	}
	
	public Object pullOut() {	// 개봉
		return item;
	}
}





