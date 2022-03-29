/*
 파일이름 : MethodReturn.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 03(목)
 프로그램 설명 : MethodReturn 대한 실습 내용.
 */
package exam02;

public class MethodReturn {
	public static void main(String[] args) {
		int result1 = multify(10, 20);
		
		if(result1 >= 1000) { // 지역변수에서 연산이 끝나서 값은 소멸되어서 오류
			System.out.println("1000 이상 이군요.");
		}
	}
	
	public static int multify(int n1, int n2) {
		int result2 = 0;
		
		result2 = n1 * n2;		
		System.out.println(n1 + " * " + n2 + " = " + result2);
		
		return result2;
	}

}
