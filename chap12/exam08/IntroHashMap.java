/*
 파일이름 : IntroHashMap.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(IntroHashMap) 사용법에 대한 실습 내용.
 */
package exam08;

import java.util.HashMap;

public class IntroHashMap {
	public static void main(String[] args) {
		//K = Key, V = Value의 약자.
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("이름", "홍길동");
		map.put("주소", "서울시 종로구");
		map.put("이메일", "abc@aaa.com");
		map.put("전화번호", "010-1111-1111");
		map.put("거주지", "경기도");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("주소"));
		System.out.println(map.get("이메일"));
		System.out.println(map.get("전화번호"));
		System.out.println(map.get("거주지"));
		
		map.remove("주소");
		System.out.println(map.get("주소"));
	}

}
