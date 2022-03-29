/*
 파일이름 : IntroLinkedList.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(LinkedList) 사용법에 대한 실습 내용.
 */
package exam02;

import java.util.Iterator;
import java.util.LinkedList;

public class IntroLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		// 데이터 저장
		list.add(10);	// Auto Boxing기능이 추가 되어서 기본자료형처럼 사용가능.
		list.add(20);
		list.add(30);
		list.add(20);
		
		// 데이터 참조(읽어오기)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============");
		
		// 저장되있는 데이터를 검색하고 메모리에 다시저장한다.
		// 그리고 그 시작 주소값을 반환한다
		Iterator<Integer> itr = list.iterator();
		// 데이터가 있으면 true를 반환한다.
		while(itr.hasNext()) {
			System.out.println(itr.next());//next메소드는 데이터를 리턴하는메소드.
		}
		
		System.out.println("===============");
		
		// 데이터 삭제
		list.remove(1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer e : list) {
			System.out.println(e);
		}
		

	}
}

