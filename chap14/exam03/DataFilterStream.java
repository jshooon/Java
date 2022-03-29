/*
 파일이름 : DataFilterStream.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream(복사 붙여넣기 기능)사용법에 대한 실습 내용.
 */
package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataFilterStream {
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("data.bin");
			DataOutputStream filterOut = new DataOutputStream(out); // 정수를 사용할때 사용하는 자료형
			
//			out.write(365);
//			out.close();
			
			filterOut.writeInt(365);	//데이터 하드디스크에 저장
			filterOut.writeDouble(3.14);//데이터 하드디스크에 저장
			filterOut.close(); // 자동으로 OutputStream도 닫아준다.
			
			InputStream in = new FileInputStream("data.bin");
			DataInputStream filterIn = new DataInputStream(in);
			
//			System.out.println(in.read());
//			in.close();
			
			System.out.println(filterIn.readInt()); 	// 데이터 하드디스크에서 읽어오기
			System.out.println(filterIn.readDouble());	// 데이터 하드디스크에서 읽어오기
			filterIn.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

}
