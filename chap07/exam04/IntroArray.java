/*
 파일이름 : IntroArray.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : IntroArray(배열)에 대한 실습 내용.
 */
package exam04;

public class IntroArray {
	public static void main(String[] args) {
		int korean = 90, english = 95, math = 85, social = 95, science = 90;
		
		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		System.out.println(social);
		System.out.println(science);
		
		System.out.println("===");
//		int leesunshin[] = new int[5]; // 뒤에다 붙여도 상관 없다, 하지만 밑에 사용법을 선호.
		int[] leesunshin = new int[5]; // int형의 4byte 메모리 공간을 5개 할당해달라는 기호.
		leesunshin[0] = 90;
		leesunshin[1] = 95;
		leesunshin[2] = 85;
		leesunshin[3] = 95;
		leesunshin[4] = 90;
		
		System.out.println(leesunshin[0]);	// 배열만을 사용 하였을 때 비효율적 사용.
		System.out.println(leesunshin[1]);
		System.out.println(leesunshin[2]);
		System.out.println(leesunshin[3]);
		System.out.println(leesunshin[4]);
		
		System.out.println("===");
		
		for(int i = 0; i < leesunshin.length; i++) { // for문과 length를 사용하여 효율적 사용.
			System.out.println(leesunshin[i]);
		}
		
		System.out.println("===");
		
		
		// 배열 선언과 동시에 초기화 설정법 2가지.
		// 밑에 코드를 실무에서 선호한다.
//		int[] hongkildong = new int[] {70, 65, 80, 50, 65}; 
		int[] hongkildong = {70, 65, 80, 50, 65}; 
		
		for(int i = 0; i < hongkildong.length; i++) { // for문과 length를 사용하여 효율적 사용.
			System.out.println(hongkildong[i]);
		
		
		}

	}
}