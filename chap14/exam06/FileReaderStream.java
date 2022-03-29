/*
 파일이름 : FileReaderStream.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {
	public static void main(String[] args) {
		char[] cbuf = new char[10]; // 한번에 저장된 공간을
		
		try {
			Reader in = new FileReader("hyper.txt");
			//첫번째 매개변수에는 읽어온 데이터를 저장하고있는 데이터의 자료형의 참조변수 
			//두번째 매개변수에는 어디서부터 읽어올지, 
			//세번째 매개변수는 cbuf에 저장된 수만큼 읽어올지를 정해준다.
			int readCnt = in.read(cbuf, 0, cbuf.length);	 
			for(int i = 0; i < readCnt; i++) {
				System.out.println(cbuf[i]);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
