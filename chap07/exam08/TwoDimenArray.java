/*
 파일이름 : TwoDimenArray.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : TwoDimenArray(2차원 배열)에 대한 실습 내용.
 */
package exam08;

public class TwoDimenArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];// 2차원 배열(3행4열)
//		int arr[][] = new int[3][4]; // 이런 사용법도 있다.		
//		int[] arr[] = new int[3][4]; // 이런 사용법도 있다.	
	
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = 7;

		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;
		arr[2][3] = 11;
		
		for(int i = 0; i < arr.length; i++){ // 행일경우
			for(int j = 0; j < arr[i].length; j++) { // 열일경우
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
