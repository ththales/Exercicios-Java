// 18) Função ehPalindromo que verifica se uma string é palíndromo.

import java.util.Scanner;

public class Solution {
	public static String inverterString(String str) {
		char arr[] = str.toCharArray();
		for(int i=0, j=str.length()-1; i<j; i++, j--) {
			char aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
		}
		return new String(arr);
	}
	public static boolean ehPalindromo(String str) {
		str = str.toLowerCase();
		String strInv = inverterString(str);
		return str.equals(strInv);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();	
		scan.close();
		if(ehPalindromo(str)) {
			System.out.println(str + " eh palindromo.");
		}
		else {
			System.out.println(str + " nao he palindromo.");
		}
	}
}