/*
 파일이름 : HashSetEqual2.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 23(수)
 프로그램 설명 : Collection Framework(HashSetEqual2) 사용법에 대한 실습 내용.
 */
package exam05;

import java.util.HashSet;

class Person{
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && (age == tmp.age);
		}
		return false;
	}
	
}

public class HashSetEqual2 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person("홍길동", 54));
		set.add(new Person("이순신", 27));
		set.add(new Person("강감찬", 30));
		set.add(new Person("안중근", 55));
		set.add(new Person("강감찬", 32));
		set.add(new Person("안중근", 55));
		
		for(Person e : set) {
			System.out.println(e);
		}
	}

}
