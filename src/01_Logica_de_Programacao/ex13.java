// 13) Receba um número e diga se ele é múltiplo de 3 e 5.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if(num%3==0 && num%5==0) {
			System.out.println(num + " é múltiplo de 3 e 5.");
		}
		else {
			System.out.println(num + " não é múltiplo de 3 e 5.");
		}
	}
}