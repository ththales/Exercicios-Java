// 19) Função fatorialIterativo que calcula fatorial usando loop.

import java.util.Scanner;

public class Solution {
	public static long fatorialIterativo(int num) {
		long fat = 1;
		for(int i=num; i>=2; i--) {
			fat *= i;
		}
		return fat;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		long fat = fatorialIterativo(num);
		System.out.println(num + "! = " + fat);
	}
}