/*
 파일이름 : StringMethod.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 10(목)
 프로그램 설명 : StringMethod에 대한 실습 내용.
 */
package exam02;
public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
		String str4 = null;
		
		System.out.println("Smart" + " and " + "Simple");
		System.out.println(str1.concat(str2).concat(str3));
		// concat : 문자열 결합메소드, 사용 최소화.
		// 반복문 안에 concat메소드가 들어가면 치명타.
		str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);
		
		
		System.out.println('a');
		if(str1.compareTo(str3) < 0) { // compareTo : 차 값을 계산해준다
			System.out.println("str1 문자열이 str3 문자열보다 사전의 앞에 나온다.");
		}else if(str1.compareTo(str3) == 0){
			System.out.println("str1 문자열과 str3문자열이 같다.");			
		}else {
			System.out.println("str1 문자열이 str3 문자열보다 사전의 뒤에 나온다.");			
		}
		
		
	}

}
