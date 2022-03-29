/*
 파일이름 : ByteFileCopy.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 24(목)
 프로그램 설명 : Stream(복사 붙여넣기 기능)사용법에 대한 실습 내용.
 */
package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
			//저장할 임시공간을 Buffer라 한다.
public class BufferFileCopy {
	public static void main(String[] args) {
		try {
			byte[] buf = new byte[8192];
			int readLen = 0;
			int copyByte = 0;
			InputStream in = new FileInputStream("Fonts.zip"); // Ctrl + c 기능
			OutputStream out = new FileOutputStream("CopyBufferd.zip"); // Ctrl + v 기능
			
			while(true) {
				readLen = in.read(buf);
				if(readLen == -1) {	// -1인 경우는 데이터를 다 읽어 왔다는 뜻.
					break;
				}
						//배열에 저장된 데이터, 그리고 두번째 매개변수는 시작점 때문에 0 마지막매개변수은 다읽어온 리턴된 데이터값까지
				out.write(buf, 0, readLen); // 3개의 매개변수를 받기로 오버로딩 되어있다.
				copyByte += readLen;
			}
			System.out.println("복사된 바이트 크기(Buffer) : " + copyByte);
			in.close();
			out.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
