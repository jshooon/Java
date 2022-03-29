/*
 파일이름 : StringWriter.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("String.txt"));
			String str = null;
			while(true) {
				str = in.readLine();
				if(str == null) {
					break;
				}
				
				System.out.println(str);
			}
			
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
