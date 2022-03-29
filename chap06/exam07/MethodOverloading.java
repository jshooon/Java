/*
 파일이름 : MethodOverloading.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 09(수)
 프로그램 설명 : MethodOverloading 사용방법에 대한 실습 내용.
 */
package exam07;
class Adder{
	public int add(int n1, int n2) {return n1 + n2;}
	public double add(double n1, double n2) {return n1 + n2;}
	public double add(int n1, double n2) {return n1 + n2;}
	public double add(double n1, int n2) {return n1 + n2;}
	public double add(double n1, int n2, int n3) {return n1 + n2 + n3;}
	
	/* 반환형 타입이 다른 것은 오버로딩에 영향을 미치지 않는다.
	public double add(int n1, int n2) {return n1 + n2;}
	 * ex ) int num;
	 * 		double num; 은 사용 못하는 것처럼.
	*/
	// 매개변수의 타입이 서로 다르면 동일변수이름으로 메소드 정의가능.
	// 매개변수의 개수가 달라도 동일변수이름으로 메소드 정의가능.
}

public class MethodOverloading {
	public static void main(String[] args) {
		Adder adder = new Adder();
		
		System.out.println("100 + 200 = " + adder.add(100, 200));
		System.out.println("3.14 + 5.45 = " + adder.add(3.14, 5.45));
		System.out.println("3 + 5.45 = " + adder.add(3, 5.45));
		System.out.println("3.14 + 5 = " + adder.add(3.14, 5));
		System.out.println("3.14 + 5 + 10 = " + adder.add(3.14, 5, 10));
		System.out.println("3 + 5 + 10 = " + adder.add(3, 5, 10));
		
	}

}
