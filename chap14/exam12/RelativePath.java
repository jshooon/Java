/*
 파일이름 : RelativePath.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 25(금)
 프로그램 설명 : Stream 사용법에 대한 실습 내용.
 */
package exam12;

import java.io.File;

public class RelativePath {
	public static void main(String[] args) {
		// 리눅스나 맥의 운영체제는 /로 경로표시를 하기때문에.						
		// File.seprator메소드를 사용하여 어느 운영체제든간에 맞는 폴더경로표시를 자바가 알아서 변환시켜준다.								
		//최상위 폴더부터 하위 폴더로 이동하는 경로를 절대경로라 한다.
//		File myFile = new File("c:"+File.separator+"MyJava"+File.separator+"my.bin"); // 절대경로.
		// 절대경로를 하지않고 그냥 지정한다면 상대경로라한다.
		// 그리고 이렇게 지정한다면, 폴더 위치는 지금 실행하고있는 프로젝트 위치인 chap14가 된다.
		File myFile = new File("MyJava"+File.separator+"my.bin"); // 상대경로. 
		// 파일이 존재하지않는지 알아야하기 때문에 if문을 사용. 
		if(myFile.exists() == false) {	// 파일과 폴더의 존재의 유무 확인 메소드.
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		// File자료형의 mkir메소드는 작성한 위치에 결과는 디렉토리가 만들어지는 기능메소드.
		File reDir = new File("c:"+File.separator+"YourJava"+File.separator+"Java");
		reDir.mkdirs(); //두개이상 폴더를 만들기 때문에 mkdirs이다.
		
		// File자료형의 renameTo메소드는 이름도 변경하며, 파일을 옮기는 메소드.
		File reFile = new File(reDir, "my.bin"); 
		myFile.renameTo(reFile); // 이름을 변경하고, 복사의 개념
		
		System.out.println("프로그램 종료.");
	
	}

}