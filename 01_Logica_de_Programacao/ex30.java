// 30) Receba o salário de um funcionário e aplique um aumento de 10% se for menor que 3000.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sal = scan.nextDouble();
		scan.close();
		if(sal<3000.00) {
			sal *= 1.1;
		}
		System.out.printf("R$: %.2f", sal);
	}
}