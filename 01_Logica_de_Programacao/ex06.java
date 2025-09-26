// 06) Calcule a média de três notas e imprima o resultado.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		scan.close();
		double med = (n1+n2+n3)/3.0;
		System.out.println("Média = " + med);
	}
}