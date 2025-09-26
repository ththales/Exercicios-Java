// 04) Crie uma variável preco do tipo double e imprima com 2 casas decimais.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.close();
		double preco = scan.nextDouble();
		System.out.printf("R$: %.2f%n", preco);
	}
}