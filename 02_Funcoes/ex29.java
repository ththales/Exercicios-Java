// 29) Função que recebe um número e retorna se ele é primo.

import java.util.Scanner;

public class Solution {
	public static boolean ehPrimo(int num) {
		if(num==1) return false;
		if(num==2) return true;
		if(num%2==0) return false;
		
		int max = (int)Math.sqrt(num);
		
		for(int i=3; i<=max; i+=2) {
			if(num%i==0) return false;
		}
	
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(ehPrimo(num)) {
			System.out.println(num + " eh primo.");
		}
		else {
			System.out.println(num + " nao eh primo.");
		}
		
		scan.close();
	}
}