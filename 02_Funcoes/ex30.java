// 30) Crie uma função recursiva somarAteN que receba um inteiro positivo N e retorne a soma de todos os números de 1 até N.

import java.util.Scanner;

public class Solution {
	public static int somarAteN(int n) {
		if(n==1) {
			return 1;
		}
		return n + somarAteN(n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int s = somarAteN(n);
		
		System.out.println(s);
		
		scan.close();
		
	}
}