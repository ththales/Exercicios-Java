// 08) Função menor que recebe dois números e retorna o menor.

import java.util.Scanner;

public class Solution {
	public static int menor(int x, int y) {
		if(x<y) {
			return x;
		}
		return y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		int r = menor(x, y);
		System.out.println(r);
	}
}