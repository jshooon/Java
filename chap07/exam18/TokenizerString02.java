/*
 파일이름 : TokenizerString02.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : StringTokenizer사용방법에 대한 실습 내용.
 */
package exam18;

import java.util.StringTokenizer;

public class TokenizerString02 {
	public static void main(String[] args) {
		String phoneNum = "TEL 82-02-1234-5678";
		
		System.out.println("First Result ===");
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Secone Result ===");	
		st1 = new StringTokenizer(phoneNum," -"); // 두개이상의 구분도 가능하다.(여백 & -)
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("Third Result ===");	
		st1 = new StringTokenizer(phoneNum," -", true); // 디폴트 값은 false지만 true를 넣어주면,
														// 구분자 출력이된다.(구분자 출력여부)
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}

}
