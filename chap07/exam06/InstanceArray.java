/*
 파일이름 : InstanceArray.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : InstanceArray(배열)에 대한 실습 내용.
 */
package exam06;

public class InstanceArray {
	public static void main(String[] args) {
		String[] strArr = new String[3];

		strArr[0] = "홍길동"; // new String("홍길동");
		strArr[1] = "이순신";
		strArr[2] = "세종대왕";
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
