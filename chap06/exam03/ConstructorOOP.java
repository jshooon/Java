/*
 파일이름 : ConstructorOOP.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 04(금)
 프로그램 설명 : ConstructorOOP 객체지향 프로그램에 대한 실습 내용.
 */
package exam03;

class StudentScore{ //참조자료형
	// field(멤버변수)
	String name; 	// 메인메소드에 new StudentScore 키워드를쓰면
	int quiz1;		// java가 여기에 나열된 변수들의 
	int midTerm;	// 메모리할당을 해달라는 요청의 뜻.
	int quiz2;		// 그럼 java는 변수들의 메모리할당을 해줌
	int finalTerm;

	StudentScore(String n, int q1, int mid, int q2, int f){	//Constructor(생성자)
		//System.out.println("StudentScore() 호출...");
		name = n;
		quiz1 = q1;
		midTerm = mid;
		quiz2 = q2;
		finalTerm = f;
	}
	
	// (멤버) 메소드
	public int sum() {
		int result = 0;
		
		result = quiz1 + midTerm + quiz2 + finalTerm;
		return result;
	}
	
	public int average() {
		int result = 0;
		
		result = (quiz1 + midTerm + quiz2 + finalTerm) / 4;
		return result;
				
	}
}

public class ConstructorOOP {
	public static void main(String[] args) {
		
		StudentScore hongkildong; // 참조변수
		hongkildong = new StudentScore("홍길동", 85, 80, 90, 95); // Instance화 요청 -> Instance
//선언은 StudentScore hongkildong = new StudentScore(); 
//이렇게 해도 상관없다.
	
//		hongkildong.name = "홍길동"; // 메모리접근방법(데이터저장)
//		hongkildong.quiz1 = 85;
//		hongkildong.midTerm = 80;
//		hongkildong.quiz2 = 90;
//		hongkildong.finalTerm = 95;
//		
		System.out.println(hongkildong.name);
		System.out.println(hongkildong.quiz1);
		System.out.println(hongkildong.midTerm);
		System.out.println(hongkildong.quiz2);
		System.out.println(hongkildong.finalTerm);
		System.out.println("홍길동의 총점 : " + hongkildong.sum());
		System.out.println("홍길동의 평균 : " + hongkildong.average());
		
		StudentScore kangKamChan;
		kangKamChan = new StudentScore("강감찬", 75, 60, 80, 100);

		System.out.println(kangKamChan.name);
		System.out.println(kangKamChan.quiz1);
		System.out.println(kangKamChan.midTerm);
		System.out.println(kangKamChan.quiz2);
		System.out.println(kangKamChan.finalTerm);
		System.out.println("강감찬의 총점 : " + kangKamChan.sum());
		System.out.println("강감찬의 평균 : " + kangKamChan.average());
		
		StudentScore leeSunShin;
		leeSunShin = new StudentScore("이순신", 95, 90, 85, 80);
		
		leeSunShin.name = "이순신";
		leeSunShin.quiz1 = 95;
		leeSunShin.midTerm = 90;
		leeSunShin.quiz2 = 85;
		leeSunShin.finalTerm = 80;
		
		StudentScore youKanSun;
		youKanSun = new StudentScore("유관순", 75, 90, 90, 100);
		
		youKanSun.name = "유관순";
		youKanSun.quiz1 = 75;
		youKanSun.midTerm = 90;
		youKanSun.quiz2 = 90;
		youKanSun.finalTerm = 100;
		
		StudentScore anJungKun;
		anJungKun = new StudentScore("안중근", 85, 80, 85, 80);

		anJungKun.name = "안중근";
		anJungKun.quiz1 = 85;
		anJungKun.midTerm = 80;
		anJungKun.quiz2 = 85;
		anJungKun.finalTerm = 80;
		
		
	}
}
