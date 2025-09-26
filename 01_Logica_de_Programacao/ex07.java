// 07) Faça uma divisão de dois números e mostre o resto da divisão.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int div = a/b;
		int mod = a%b;
		System.out.println(a + "/" + b + " = " + div);
		System.out.println("Resto = " + mod);
	}
}