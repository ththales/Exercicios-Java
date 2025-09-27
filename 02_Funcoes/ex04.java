// 04) Função divisao com dois parâmetros double, retornando double.

import java.util.Scanner;

public class Solution {
	public static double div(double x, double y) {
		return x/y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		scan.close();
		double r = div(x, y);
		System.out.printf("x/y = %.5f", r);
	}
}