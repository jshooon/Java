/*
 파일이름 : IntroTreeSet.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(IntroTreeSet) 사용법에 대한 실습 내용.
 */
package exam06;

//import java.util.HashSet;
import java.util.TreeSet;

public class IntroTreeSet {
	public static void main(String[] args) {
		
//		HashSet<String> set = new HashSet<String>();// 정렬이 되는지 않되는지 실험한 코드
		TreeSet<String> set = new TreeSet<String>();
		
		// 데이터 저장
		
		set.add("First");
		set.add("Third");
		set.add("Second");
		set.add("Second");
		set.add("Fourth");
		
		System.out.println(set.size());
		
		for(String e : set) {
			System.out.println(e);
		}
	}

}
