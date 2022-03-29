/*
 파일이름 : PrintfMethod.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 14(월)
 프로그램 설명 : PrintfMethod 문자출력방법에 대한 실습 내용.
 */
package exam15;

// import java.lang.String; // java.lang는 자동으로 import가 되어있다
// import java.lang.System; // java.lang는 자동으로 import가 되어있다
// import java.lang.*// java.lang에 들어 있는 모든 클래스를 import 한다는 뜻.

public class PrintfMethod {
	public static void main(String[] args) {
		int age = 20;
		double tall = 185.7;
		String name = "지 성훈";
		
		// 서식 종류 : %s 문자열, %d 정수, %f 실수. 실수 자리수 설정은 f앞에 .숫자를 써주면 그 숫자가 자리수를 설정한다.
		//			   %x는 16진수, %o 8진수
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.printf("제 이름은 %s입니다.\n", name); // printf의 사용법. %s < 자료형 서식 쓰고 끝에 +,참조변수
		System.out.printf("나이는 %d살이고, 키는 %.2f입니다.\n", age, tall); // printf의 사용법. %d, < 자료형 서식 쓰고 끝에 +,참조변수
		System.out.printf("%d, 0x%x, 0%o\n", 77, 77, 77); // 10진수 16진수 8진수 표기 서식.
		System.out.printf("%.5f, %e\n", 0.00014, 0.00014);
		System.out.printf("%g, %g\n", 0.00014, 0.000014);
	}

}
