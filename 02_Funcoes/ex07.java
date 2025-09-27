// 07) Função maior que recebe dois números e retorna o maior.

import java.util.Scanner;

public class Solution {
	public static int maior(int x, int y) {
		if(x>y) {
			return x;
		}
		return y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int r = maior(x, y);
		System.out.println(r);
	}
}