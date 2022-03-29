/*
 파일이름 : ObjectEquals.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam02;

class IntNumber{
	int num;

	IntNumber(int num) { this.num = num; }

	@Override
	public boolean equals(Object obj) {
		IntNumber intNum = (IntNumber)obj; // 강제형변환.
		if(this.num == intNum.num) { //이퀄스메소드를  오버라이딩하여 재정의하여 비교한다.
			return true;
		}else {
			return false;
		}
	}
	
	
}

public class ObjectEquals {
	public static void main(String[] args) {
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.equals(num2)) {	//if(num1 == num2)
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}	
		if(num1.equals(num3)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
	}

}
