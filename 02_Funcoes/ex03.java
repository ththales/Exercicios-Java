// 03) Função multiplicacao com dois parâmetros inteiros.

import java.util.Scanner;

public class Solution {
	public static int mult(int x, int y) {
		return x*y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int r = mult(x, y);
		System.out.println("x*y = " + r);
	}
}