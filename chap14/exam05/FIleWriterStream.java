/*
 파일이름 : FIleWriterStream.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FIleWriterStream {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		try {
			Writer out = new FileWriter("hyper.txt"); // 문자열 저장 메소드.
			out.write(ch1);
			out.write(ch2);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
