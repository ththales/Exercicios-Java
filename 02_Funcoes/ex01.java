// 01) Crie uma função soma que receba dois inteiros e retorne o resultado.

import java.util.Scanner;

public class Solution {
	public static int add(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int r = add(x, y);
		System.out.println("x+y = " + r);
	}
}