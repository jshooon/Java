/*
 파일이름 : Calculator.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 08(화)
 프로그램 설명 : 참조자료형을 세분화 하여 필요한 참조자료형만 사용방법에 대한 실습 내용.
 */
package exam06.cal;

public class Calculator { // Calculator 클래스 안에 세부적으로 기능을 나눠서 사용하는 실습
						  // 덧셈만 사용하거나, 뺄셈만 사용하거나 이럴경우.
						  // 밑에 public이 붙지 않은 class는 Calculator 클래스 안에서만 사용하기 위해 만든 참조자료형.
	
	
	// int num; 과 아래와 다르지 않고 같다. 아래는 주소값을 담은것 뿐.
	Adder adder;				// 참조변수 선언
	Subtractor subtractor;
	
	public Calculator(){ // 이렇게 초기 값을 줌으로 써 메인에서 필요한 기능만 사용 할 수 있다.
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int num1, int num2) {
		int result = 0;
		
		result = adder.addTwoNumber(num1, num2);
		return result;
	}
	
	public int subTwoNumber(int num1, int num2) {
		int result = 0;
		
		result = subtractor.subTwoNumber(num1, num2);
		return result;
	}
	
	public void showOperationTimes() {
		System.out.println("덧셈횟수 : " + adder.getCntAdd());
		System.out.println("뺄셈횟수 : " + subtractor.getCntSub());
	}
}

class Adder{
	private int cntAdd;
	
	Adder(){
		cntAdd = 0;
	}
	
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1 + n2;
	}

	int getCntAdd() {
		return cntAdd;
	}
	
}

class Subtractor{
	
	private int cntSub;
	
	Subtractor(){
		cntSub = 0;
	}
	
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
	
	int getCntSub() {
		return cntSub;
	}
}

