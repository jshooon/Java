/*
 파일이름 : StringWriter.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) {
		try {
//			Writer out =  new FileWriter("String.txt");
//			BufferedWriter bWriter = new BufferedWriter(out);
			// 위와 같은 코드다. 한줄로 코드 줄임
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			// 만약 동일한 파일이 있다면, 전부 지우고 다시 저장한다.
			out.write("더조은 아이티 아카데미");
			out.newLine(); // 줄바꿈 
			out.write("서울시 종로구");
			out.newLine(); // 줄바꿈 
			out.write("데이터 입력 완료.");
			out.newLine(); // 줄바꿈 
			out.close();	// 까먹지 말자.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
