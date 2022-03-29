/*
 파일이름 : ThreeDimenArray.java
 작 성 자 : 지 성훈
 작 성 일 : 2022. 02. 11(금)
 프로그램 설명 : ThreeDimenArray(3차원 배열)에 대한 실습 내용.
 */
package exam10;

public class ThreeDimenArray {
	public static void main(String[] args) {
		int[][][] threeDimenArray = new int[2][3][4]; //2면 3행 4열.
		int num = 0;
		
		for(int i = 0; i < threeDimenArray.length; i++) {
			for(int j = 0; j < threeDimenArray[i].length; j++) {
				for(int k = 0; k < threeDimenArray[i][j].length; k++) {
					threeDimenArray[i][j][k] = num++;
					
				}
			}
		}
		
		for(int i = 0; i < threeDimenArray.length; i++) {
			for(int j = 0; j < threeDimenArray[i].length; j++) {
				for(int k = 0; k < threeDimenArray[i][j].length; k++) {
					System.out.println("[" + i + "][" + j + "][" + k + "] = " + threeDimenArray[i][j][k]);
					
				}
			}
		}
	}
}
