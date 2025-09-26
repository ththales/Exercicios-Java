// 10) Verifique se um número está entre 10 e 50.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		if(a>=10 && a<=50) {
			System.out.println(a + " está entre 10 e 50");
		}
		else {
			System.out.println(a + " não está entre 10 e 50");
		}
	}
}