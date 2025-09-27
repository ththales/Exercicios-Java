// 02) Crie uma função subtracao que receba dois inteiros e retorne a diferença.

import java.util.Scanner;

public class Solution {
	public static int sub(int x, int y) {
		return x-y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int r = sub(x, y);
		System.out.println("x-y = " + r);
	}
}