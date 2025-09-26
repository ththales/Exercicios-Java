// 12) Receba duas notas e mostre se o aluno passou (média >= 6.0).

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		scan.close();
		double med = (n1+n2)/2.0;
		System.out.println("Med = " + med);
		if(med>=6.0) {
			System.out.println("Você passou!");
		}
		else {
			System.out.println("Você reprovou :(");
		}
	}
}