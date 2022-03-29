/*
파일 이름 : DefineVariable.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : DefineVariable에 대한 실습 내용.
*/
package exam01;
public class DefineVariable {
	public static void main(String[] args) {
		// 5489 + 9527 = ?
		System.out.println(5489 + 9527);
		
		int data1; // (1) 메모리 저장 공간 할당 요청.
				   // data1은 메모리 저장 공간 이름 붙여준것.
				   // 요청한 이유는 값을 저장 하기 위해서.
		int data2;
		int sum;
		
		data1 = 5489; // (2) 메모리 접근 방법(데이터 저장) 
					  // =(대입 연산자)는 같다는 뜻의 기호가 아니라,
					  // 오른쪽 값을 data1에 저장 하라는 컴퓨터 기호다.
		
		data2 = 9527;
	
		sum = data1 + data2; // 3+2*2 연산 우선순위 연산과 실행은 순서대로 
							 // 자바 실행은 위에서 부터 아래로 왼쪽에서 오른쪽으로.
				       
		System.out.println(data1); // (3) 메모리 접근 방법(데이터 읽어 오기)
		
		System.out.println(data2);

		System.out.println(data1 + data2);	//데이터를 보관하여 장점은
		System.out.println(data1 - data2);	//언제든지 변수를 불러와서
		System.out.println(data1 * data2);	//다른 방식으로 사용 할 수 있다.
		System.out.println(data1 / data2);
		
		System.out.println("5489 + 9527 = " + (data1 + data2));
		
		System.out.println(sum);
		
		System.out.println("5489 + 9527 = " + sum);
		
		System.out.println(data1+" + "+data2+" = "+sum);
		
		System.out.println(sum / 100);
		
		data1 = 1234;	// 메모리 재사용 위에서 사용한 변수에  
		data2 = 4321;   // 다른 데이터값을 넣으면 기존 값은 버려지고 
						// 새로운 데이터 값이 채워진다.
		System.out.println(data1);
		System.out.println(data2);
		
		// int int;		//예약어 사용 금지
		// int 1data;	// 숫자로 시작 할 수 없음.
		// 
		// 카멜 - > 자바, 파스칼 - > c언어, 헝가리언 -> 비주얼C++
	}

}
