/*
 파일이름 : ObjectReadable.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam11;

import java.io.File;

public class FileMove {
	public static void main(String[] args) {
		File myFile = new File("c:\\MyJava\\my.bin");
		// 파일이 존재하지않는지 알아야하기 때문에 if문을 사용. 
		if(myFile.exists() == false) {	// 파일과 폴더의 존재의 유무 확인 메소드.
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		// File자료형의 mkir메소드는 작성한 위치에 결과는 디렉토리가 만들어지는 기능메소드.
		File reDir = new File("c:\\YourJava\\Java");
		reDir.mkdirs(); //두개이상 폴더를 만들기 때문에 mkdirs이다.
		
		// File자료형의 renameTo메소드는 이름도 변경하며, 파일을 옮기는 메소드.
		File reFile = new File(reDir, "myMove.bin"); 
		myFile.renameTo(reFile); // 이름을 변경하고, 복사의 개념
		
		System.out.println("프로그램 종료.");
	}
}
