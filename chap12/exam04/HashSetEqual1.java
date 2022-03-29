/*
 파일이름 : HashSetEqual1.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(HashSetEqual1) 사용법에 대한 실습 내용.
 */
package exam04;

import java.util.HashSet;

class Num{
	int num;

	Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public boolean equals(Object obj) {
		Num comp =(Num)obj;
		if(num == comp.num) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return num % 3;
	}
}

public class HashSetEqual1 {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(30));
		
		for(Num e : set) {
			System.out.println(e);
		}
		
	}

}








