/*
 파일이름 : ArrayAndMethods.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : ArrayAndMethods(1차원 배열)에 대한 실습 내용.
 */
package exam07;

public class ArrayAndMethods {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int num = 5;
		
		int[] ref = null;
				
		ref = addAllArray(arr, num); // stack영역은다르지만  Heap영역 같은 메모리를 가리킨다.
		
		addAllArray(arr, num);
		
		for(int i = 0; i < arr.length; i++) { // 결과 값은 Heap영역 주소값에 저장되기 때문에
			System.out.println(arr[i]);		  // 값은 아래 arr과 위 arr과 값은 똑같다.
		}
		
		System.out.println("===================");
		
		for(int i = 0; i < ref.length; i++) { // 결과 값은 Heap영역 주소값에 저장되기 때문에
			System.out.println(arr[i]);		  // 값은 아래 arr과 위 arr과 값은 똑같다.
		}
		
		if(arr == ref) {
			System.out.println("같은 메모리 영역");
		}else {
			System.out.println("다른 메모리 영역");			
		}
		
		
		
	}
	
	public static int[] addAllArray(int[] arr, int num) {
		System.out.println("===================");
		num = 10; // 새로운 값 대입.
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] += 10;
			System.out.println(arr[i]);
		}
		
		return arr;
	}
}
