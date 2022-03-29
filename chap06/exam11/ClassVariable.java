/*
 파일이름 : ClassVariable.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 09(수)
 프로그램 설명 : ClassVariable 사용방법에 대한 실습 내용.
 */
package exam11;

class InstCnt{
	static int instNum;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
}

public class ClassVariable {
	public static void main(String[] args) {
		InstCnt.instNum =  10; // 접근의 방법 클래스.
		
		InstCnt.instNum++;
		System.out.println(InstCnt.instNum);
		
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		System.out.println(cnt1.instNum);
		System.out.println(cnt2.instNum);
		System.out.println(cnt3.instNum);
		
	}

}
