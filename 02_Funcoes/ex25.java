// 25) Função que recebe uma String e conta letras maiúsculas.

import java.util.Scanner;

public class Solution {
	public static int letrasMaiusculas(String str) {
		char arr[] = str.toCharArray();
		
		int qtd = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z' ) {
				qtd++;
			}
		}
		return qtd;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		scan.close();
		
		int qtd = letrasMaiusculas(str);
	
		System.out.println(qtd);
	}
}