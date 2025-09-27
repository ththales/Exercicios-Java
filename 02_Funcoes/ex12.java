// 12) Função potencia que recebe dois inteiros base e expoente e retorna o resultado.

import java.util.Scanner;

public class Solution {
	public static int potencia(int base, int exp) {
		int r = 1;
		for(int i=0; i<exp; i++) {
			r *= base;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int exp = scan.nextInt();
		scan.close();
		int r = potencia(base, exp);
		System.out.println(base + "^" + exp + " = " + r);
	}
}	