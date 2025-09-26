// 08) Verifique se um número é par ou ímpar.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		System.out.println((a%2==0) ? "É par" : "É ímpar");
	}
}