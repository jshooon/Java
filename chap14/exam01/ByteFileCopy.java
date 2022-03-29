/*
 파일이름 : ByteFileCopy.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 24(목)
 프로그램 설명 : Stream(복사 붙여넣기 기능)사용법에 대한 실습 내용.
 */
package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {
	public static void main(String[] args) {
		try {
			int copyByte = 0;
			InputStream in = new FileInputStream("Fonts.zip"); // Ctrl + c 기능
			OutputStream out = new FileOutputStream("Copy.zip"); // Ctrl + v 기능
			
			while(true) {
				int bData = in.read();
				if(bData == -1) {	// -1인 경우는 데이터를 다 읽어 왔다는 뜻.
					break;
				}
				
				out.write(bData);
				copyByte++;
			}
			in.close();
			out.close();
			
			System.out.println("복사된 바이트 크기 : " + copyByte);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
