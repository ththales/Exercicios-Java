// 01) Crie uma variável nome e imprima seu valor.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		scan.close();
		System.out.println(nome);
	}
}