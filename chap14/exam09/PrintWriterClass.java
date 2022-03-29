/*
 파일이름 : PrintWriterClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {
	public static void main(String[] args) {
		try {
			// 데이터를 printf.txt 파일로 출력을 하겠다고 통로를 지정 해논 것이다.
			PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
			out.printf("제 이름은 %s입니다.\n", "홍길동");
			out.println("");
			out.print("우리는 자바 입출력을 배우고 있어요.");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
