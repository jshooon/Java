/*
 파일이름 : BoxingUnboxing.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 21(월)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam06;

public class BoxingUnboxing {
	public static void main(String[] args) {
//		int num = 10;
		Integer iValue = new Integer(10); //  Boxing : 10이라는 int형의 정수값을 Integer라는 참조자료형으로 감싸고 잇다하여
		Double dValue = new Double(3.14); // Boxing
								 // intValue : 저장된 값을 가져오는 메소드 
		System.out.println(iValue.intValue());	// Unboxing 데이터를 꺼내온다 하여
								 // // doubleValue : 저장된 값을 가져오는 메소드
		System.out.println(dValue.doubleValue());	// Unboxing
		
		int num1 = iValue.intValue();
		double num2 = dValue.doubleValue();
		
		System.out.println(num1);
		System.out.println(num2);
		
		iValue = new Integer(iValue.intValue() + 10);
		System.out.println(iValue.intValue());
	}

}
