/*
 파일이름 : ComparablePerson.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(ComparablePerson) 사용법에 대한 실습 내용.
 */
package exam07;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	@Override
	public int compareTo(Person o) {
		if(age > o.age) {
			return 1;	//양의 정수값으로 리턴하면 정렬해준다.
		}else if(age == o.age) {
			return 0;	
		}else {
			return -1;
		}
	}
}

public class ComparablePerson {

	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("홍길동", 54));	// Person p1 = new Person("홍길동", 54);
		set.add(new Person("이순신", 27));	// Person p2 = new Person("이순신", 27);
		set.add(new Person("강감찬", 30));	// Person p3 = new Person("강감찬", 30);
		set.add(new Person("안중근", 55));	// Person p4 = new Person("안중근", 55);
		set.add(new Person("강감찬", 32));	// Person p5 = new Person("강감찬", 32);
		set.add(new Person("안중근", 55));	// Person p6 = new Person("안중근", 55);
		
		for(Person e : set) {
			e.showData();
		}
	}

}
