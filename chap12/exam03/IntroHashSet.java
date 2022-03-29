/*
 파일이름 : IntroHashSet.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(HashSet) 사용법에 대한 실습 내용.
 */
package exam03;

import java.util.HashSet;
import java.util.Iterator;

public class IntroHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		// 데이터 저장
		set.add(10);	// Auto Boxing기능이 추가 되어서 기본자료형처럼 사용가능.
		set.add(20);
		set.add(30);
		set.add(20);
		
		// 데이터 참조(읽어오기)
//		for(int i = 0; i < set.size(); i++) {
//			System.out.println(set.get(i));
//		}
		
		//set에 저장되있는 데이터를 검색하고 메모리에 다시저장한다.
		//그리고 그 시작 주소값을 반환한다.
		Iterator<Integer> itr = set.iterator();
				// 데이터가 있으면 true를 반환한다.
		while(itr.hasNext()) {
			System.out.println(itr.next());//next메소드는 데이터를 리턴하는메소드
		}
		
		System.out.println("===============");
		
		// 데이터 삭제
		// set은 삭제할 때엔 인덱스값이아닌 오브젝트값을 넣어줘야한다.
		set.remove(10);

		itr = set.iterator(); // 데이터삭제된거 빼고 다시 호출하기 위해 선
		
		while(itr.hasNext()) {
			System.out.println(itr.next());//next메소드는 데이터를 리턴하는메소드
		}
		
		System.out.println("===============");
		
		HashSet<String> str = new HashSet<String>();
		str.add("홍길동");
		str.add("강감찬");
		str.add("이순신");
		str.add("강감찬");
		for(String e : str) {
			System.out.println(e);
		}
	}
}


