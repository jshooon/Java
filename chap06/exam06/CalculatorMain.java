/*
 파일이름 : CalculatorMain.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 08(화)
 프로그램 설명 : CalculatorMain에 대한 실습 내용.
 */
package exam06;

import exam06.cal.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result;
		result = calculator.addTwoNumber(9, 39);
		System.out.println("9 + 39 = " + result);
		
		result = calculator.subTwoNumber(9, 39);
		System.out.println("9 - 39 = " + result);
		
		calculator.showOperationTimes();
	}

}
