/*
 파일이름 : DataBufferFilterStream.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBufferFilterStream {
	public static void main(String[] args) {
		try { // 실습 연습 할때에는 이렇게 사용하자.
			OutputStream out = new FileOutputStream("data.bin");
			BufferedOutputStream bOut = new BufferedOutputStream(out);
			// 대용량의 데이터를 라이트 한다면 Buffer를 사용한다.
			// Buffer를 연결하여 Buffer공간에 데이터를 저장하고 저장이 다 되었으면 한번에 불러온다.
			DataOutputStream filterOut = new DataOutputStream(bOut); 
			
			
			filterOut.writeInt(365);	
			filterOut.writeDouble(3.14);
			filterOut.close(); // 마지막 연결 자료형이기때문에 DataOutputStream만 닫아주면 된다.
			
			InputStream in = new FileInputStream("data.bin");
			BufferedInputStream bIn = new BufferedInputStream(in);
			DataInputStream filterIn = new DataInputStream(bIn);
			
			
			System.out.println(filterIn.readInt()); 	// 데이터 하드디스크에서 읽어오기
			System.out.println(filterIn.readDouble());	// 데이터 하드디스크에서 읽어오기
			filterIn.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

}

