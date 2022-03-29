/*
 파일이름 : ClassPrinter.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 18(금)
 프로그램 설명 : 상속(InterfaceMark)에 대한 실습 내용.
 */
package exam12;

class ClassPrinter {
						   //object obj = pos1;
	public static void print(Object obj) {
		String org = obj.toString();
		
		if(obj instanceof UpperCasePrintable) {
			org = org.toUpperCase();// 대문자로 변환하고 메로리할당하여 저장한다.
		}
		
		System.out.println(org);
	}
}