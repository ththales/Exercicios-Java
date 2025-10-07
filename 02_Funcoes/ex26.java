// 26) Função que recebe duas Strings e retorna se são anagramas.

import java.util.Scanner;

public class Solution {
	public static boolean ehAnagrama(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		for(int i=0; i<arr1.length; i++) {
			int j = 0;

			for(j=0; j<arr2.length && arr1[i]!=arr2[j]; j++);
			
			if(j==arr2.length) {
				return false;
			}
			else {
				arr2[j] = '\0';
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.nextLine();
		
		String str2 = scan.nextLine();

		scan.close();

		if(ehAnagrama(str1, str2)) {
			System.out.println("São anagramas.");
		}
		else {
			System.out.println("Não são anagramas.");
		}
		
	}
}