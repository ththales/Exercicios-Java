// 10) Função quadrado que retorna o quadrado de um número.

import java.util.Scanner;

public class Solution {
	public static int quadrado(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		int r = quadrado(x);
		System.out.println("x² = " + r);
	}
}