// 09) Verifique se um número é positivo, negativo ou zero.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		if(a>0) {
			System.out.println("Positivo");
		}
		else if(a<0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Zero");
		}
	}
}