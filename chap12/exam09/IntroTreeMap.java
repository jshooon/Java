/*
 파일이름 : IntroTreeMap.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(IntroTreeMap) 사용법에 대한 실습 내용.
 */
package exam09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class IntroTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(6, "data6");
		map.put(5, "data5");
		map.put(4, "data4");
		map.put(2, "data2");
		map.put(1, "data1");
		map.put(3, "data3");
		
		NavigableSet<Integer> navi = map.navigableKeySet();
		
		System.out.println("=== 오름 차순 ===");
		Iterator<Integer> itr = navi.iterator();	// 오름 차순 메소드
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));	// 키값 반환.
		}
		
		System.out.println("=== 내림 차순 ===");
		
		itr = navi.descendingIterator();	// 내림 차순 메소드
		
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));	// 키값 반환.
		}
	}
}