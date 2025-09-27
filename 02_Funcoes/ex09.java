// 09) Função media que recebe três números e retorna a média.

import java.util.Scanner;

public class Solution {
	public static double med(double x, double y, double z) {
		return (x+y+z)/3.0;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		scan.close();
		double r = med(x, y, z);
		System.out.println(r);
	}
}