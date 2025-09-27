// 16) Função contarVogais que recebe uma String e retorna o número de vogais.

import java.util.Scanner;

public class Solution {
	public static int contarVogais(String str) {
		int vog = 0;
		for(int i=0; i<str.length(); i++) {
			char c = Character.toLowerCase(str.charAt(i));
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vog++;
			}
		}
		return vog;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		int r = contarVogais(str);
		System.out.println(r);
	}
}