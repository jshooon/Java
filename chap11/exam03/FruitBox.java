/*
 파일이름 : FruitBox.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : Generic 사용법에 대한 실습 내용.
 */
package exam03;
class FruitBox<T> { //class는 class이름 뒤에 표시한다.
	T item;
	
	FruitBox(){}
	
	public void store(T item) {	// 포장
		this.item = item;
	}
	
	public T pullOut() {	// 개봉
		return item;
	}
}





