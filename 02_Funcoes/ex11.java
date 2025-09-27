// 11) Função cubo que retorna o cubo de um número.

import java.util.Scanner;

public class Solution {
	public static int cubo(int x) {
		return x*x*x;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		int r = cubo(x);
		System.out.println("x³ = " + r);
	}
}