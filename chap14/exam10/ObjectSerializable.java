/*
 파일이름 : ObjectSerializable.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializable {
	public static void main(String[] args) {
		Circle c1 =  new Circle(1, 1, 2.4);
		Circle c2 =  new Circle(2, 2, 4.8);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			out.writeObject(c1);
			out.writeObject(c2);
			out.writeObject("String implements Serializable");
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
