/*
 파일이름 : ObjectReadable.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadable {
	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
			Circle readC1 = (Circle)in.readObject();
			Circle readC2 = (Circle)in.readObject();
			String message = (String)in.readObject();
			
			in.close();
			
			readC1.showCircleInfo();
			readC2.showCircleInfo();
			System.out.println(message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
