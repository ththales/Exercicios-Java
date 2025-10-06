// 24) Função que recebe um número e retorna a soma dos dígitos (recursivo).

import java.util.Scanner;

public class Solution {
	public static int somarDigitos(int num) {
		if(num==0) {
			return num;
		}
		return (num%10) + somarDigitos(num/10);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		scan.close();
		
		int s = somarDigitos(num);
		
		System.out.println(s);
	}
}