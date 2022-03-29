/*
 파일이름 : AutoBoxingAutoUnBoxingOp.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.lang.package(상속관계)사용법에 대한 실습 내용.
 */
package exam08;

public class AutoBoxingAutoUnBoxingOp {
	public static void main(String[] args) {
		String name = "지 성훈";
		Integer num1 = 10;	//new Integer(10);
		Integer num2 = 20;
		for(int i = 0; i < name.length(); i++) {
			num1++;	// 기존 : num1 += 1; // num1 = new Integer(num1.intValue() + 1)
		}
		System.out.println(num1);
		
		int addResult = num1 + num2;
					  //num1.intValue() + num2.intValue()
		
		System.out.println(addResult);
	}
}
