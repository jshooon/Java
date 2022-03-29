package exam16;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		String source = "1 3 4";
		Scanner sc = new Scanner(source);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int sum = n1 + n2 + n3;
		
		
		System.out.printf("n1 = %d, n2 = %d, n3 = %d\n", n1, n2, n3, sum);
	}

}
