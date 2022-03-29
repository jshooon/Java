/*
 파일이름 : EnhancedFor.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : EnhancedFor에 대한 실습 내용.
 */
package exam11;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int e : arr) { // 주로 오른쪽에는 배열이 온다. 배열 데이터들을 하나하나씩 반복한다.
			System.out.println("e = " + e);
			sum += e; //
			
		}
		System.out.println("배열 요소의 합 : " + sum);
		
		for(int e : arr) { // 주로 오른쪽에는 배열이 온다. 배열 데이터들을 하나하나씩 반복한다.
			e++;
			System.out.print(e + " ");
			
		}
		
		System.out.println();
		
		for(int e : arr) { // 주로 오른쪽에는 배열이 온다. 배열 데이터들을 하나하나씩 반복한다.
			System.out.print(e + " ");
			
		}
		
	}

}
