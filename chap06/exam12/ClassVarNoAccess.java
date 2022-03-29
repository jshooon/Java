/*
 파일이름 : ClassVarNoAccess.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 10(목)
 프로그램 설명 : ClassVarNoAccess 사용방법에 대한 실습 내용.
 */
package exam12;

class NoAccessWay{
	static int num = 0;
	int memVari = 0;
	
	NoAccessWay(){
		incrementCnt(); // 영역안에서는 메소드 호출가능
	}
	
	public void incrementCnt() {
		memVari++;  // 접근 가능
		num++;		// 접근 가능
		
		noAccessWay(); // 메모리 할당 되있기 때문 호출 가능
	}
	
	public static void noAccessWay() {
//		memVari++;	// 인스턴스 생성되지 않을때에는 접근불가
					// 메모리할당이 되지 않았기때문.
		
		num++;		// 인스턴스 생성전이라도 접근가능  
					// static으로 인해 메모리할당이 되었기때문.
		
//		incrementCnt(); // 인스턴스 생성전이면 호출안됨.
	}
}

public class ClassVarNoAccess {
	public static void main(String[] args) {
		NoAccessWay.num = 5;		//클래스이름으로 호출
		NoAccessWay.noAccessWay();	//클래스이름으로 호출	
		
		NoAccessWay accessWay = new NoAccessWay(); // 인스턴스 생성후
		System.out.println(accessWay.num); // 변수 이름으로 호출가능
		
		accessWay.incrementCnt(); //변수 이름으로 호출가능
		System.out.println("num : " + accessWay.num);
		System.out.println("memVari : " + accessWay.memVari);
		accessWay.noAccessWay();  //변수 이름으로 호출가능
		
		System.out.println("num : " + accessWay.num);
	}

}
