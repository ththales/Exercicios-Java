// 20) Calcule o fatorial de um número.

import java.util.Scanner;

public class Solution {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int fat = 1;
		for(int i=2; i<=num; i++) {
			fat *= i;
		}
		System.out.println(fat);
	}
}