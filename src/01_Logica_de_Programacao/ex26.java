// 26) Imprima a tabuada de um número fornecido pelo usuário.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(num + "x" + i + " = " + num*i);
		}	
		scan.close();
	}
}