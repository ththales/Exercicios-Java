// 03) Declare uma variável idade e imprima se ela é maior que 18.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = scan.nextInt();
		scan.close();
		System.out.println((idade>=18) ? "Maior de idade": "Menor de idade");
	}
}