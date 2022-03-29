/*
 파일이름 : PatiallyFilledArray.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : PatiallyFilledArray(2차원 배열)에 대한 실습 내용.
 */
package exam09;

public class PatiallyFilledArray {
	public static void main(String[] args) {

//		int [][] arr new = int[][] {}; 기본 사용법.
		int[][] arr = { // 2차원 배열 선언과 동시에 초기화 설정법 가독성 좋게 작성한것.
						{0, 1, 2, 3}, //1행마다 괄호, 열은 그안에 값을적는다.
						{4, 5, 6, 7}, //2행
						{8, 9, 10, 11}//3행 마지막행은 콤마 X
					  };
		
		for(int i = 0; i < arr.length; i++){ // 행일경우
			for(int j = 0; j < arr[i].length; j++) { // 열일경우
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
		
		System.out.println("=======================");
		
		int[][] ragged = { // 2차원 배열 선언과 동시에 초기화 설정법 가독성 좋게 작성한것.
				{0, 1}, 		//1행마다 괄호, 열은 그안에 값을적는다.
				{4, 5, 6}, 		//2행
				{8, 9, 10, 11}	//3행 마지막행은 콤마 X
		};
		
		
		
		for(int i = 0; i < ragged.length; i++){ // 행일경우
			for(int j = 0; j < ragged[i].length; j++) { // 열일경우
				System.out.println("ragged[" + i + "][" + j + "] = " + ragged[i][j]);
			}
		}
	}

}
