/*
파일 이름 : CastingOperation.java
작 성 자 : 지 성훈
작 성 일 : 2022. 01. 26.(수)
프로그램 설명 : CastingOperation에 대한 실습 내용.
*/
package exam08;

public class CastingOperation {
	public static void main(String[] args) {
		char alphabet = 'Z';
		int unicode = ' ';
		long num1 = 100000000000000000l;
		float num2;
		
		num2 = num1;	// 자동 형변환		
		unicode = (int)alphabet; // 명시적 형변환
								 // int형으로 형변환이 되었다라고 
								 // 알려주는 명시적형변환
		
		System.out.println(alphabet);
		System.out.println(unicode);
		System.out.println(num2);
		
		//byte num3 = 0;
		//int num4 = 25;
		
		//num3 = num4; // error
		
		byte num3 = 0;
		int num4 = 25;
		
		num3 = (byte)num4; // error
		System.out.println(num3);
		
		byte num6 = 0;
		int num7 = 258;
		
		num6 = (byte)num7; // error
		
		System.out.println(num6);

		int score = 0; 
		double score2 = 23.5;
				
		score = (int)score2; // 강제 형변환
				
		System.out.println(score);
		System.out.println(score2);
				
		//float result = 0.5 + 19;	// error		
	
		double result = 0.5 + 19;		
		System.out.println(result);
		
		float result2 =(float)0.5 + 19;	//강제 형변환		
		System.out.println(result2);
		
		System.out.println(score);
		
		
	}
}
