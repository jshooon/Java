/*
 파일이름 : EscapeSequence.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : EscapeSequence 문자출력방법에 대한 실습 내용.
 */
package exam14;

public class EscapeSequence {
	public static void main(String[] args) {
		System.out.print("프로그램 "); 
		System.out.println("시작."); // ln은 출력을하고 다음 출력은 다음라인에서
									 // 다음라인에서 출력한다는 메소드.
		System.out.println("친구가 어제 \"잘 다녀왔어?\" 라고 물어서...");  // ""그대로 출력.
		System.out.println("친구가 어제 \n잘 다녀왔어?\n 라고 물어서...");  // 줄바꿈.
		System.out.println("친구가 어제 \t잘 다녀왔어?\t 라고 물어서...");  // Tab키만큼 공백 생김.
		System.out.println("c:\\workspace\\java\\src"); // \슬래쉬 출력.
		
		System.out.println("친구가 어제 '잘 다녀왔어?' 라고 물어서...");  // ''따옴표는 큰따옴표와 구별이 되기 때문에 \를 사용하지 않는다.
		
		
		
	}

}
