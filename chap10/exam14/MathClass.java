/*
 파일이름 : MathClass.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 22(화)
 프로그램 설명 : java.math.package사용법에 대한 실습 내용.
 */
package exam14;

public class MathClass {
	public static void main(String[] args) {
		System.out.println("원주율 : " + Math.PI);
		System.out.println("2의 제곱율 : " + Math.sqrt(2));
		
		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2 * Math.PI));
		
		double radian45 = Math.toRadians(45);
		System.out.println("sin 45 : " + Math.sin(radian45));
		System.out.println("cos 45 : " + Math.cos(radian45));
		System.out.println("tan 45 : " + Math.tan(radian45));
		
		System.out.println("로그25 : " + Math.log(25));
		System.out.println("2의 4승 : " + Math.pow(2, 4));
	}

}
