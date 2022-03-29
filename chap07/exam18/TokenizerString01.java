/*
 파일이름 : TokenizerString01.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : StringTokenizer사용방법에 대한 실습 내용.
 */
package exam18;

import java.util.StringTokenizer;

public class TokenizerString01 {
	public static void main(String[] args) {
		String data = "11:22:33:44:55";
		
		StringTokenizer st = new StringTokenizer(data,":");
		//왼쪽의 데이터값에서 두번째 매개변수를 만날때까지 입력한다.
		while(st.hasMoreTokens()) {// 클론까지만 읽어라. 있으면 true.
			System.out.println(st.nextToken());
		}
	}
}
