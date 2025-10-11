// 02) Crie um array de strings e imprima cada elemento em maiúsculas.

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static String toUpper(String str) {
		char charArr[] = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i]>='a' && charArr[i]<='z') {
				charArr[i] -= 32;
			}
		}
		
		String strFinal = new String(charArr);
		
		return strFinal;
	}
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		int continuar = 1;
		
		do {
			System.out.print("String: ");
			String str = scan.nextLine();
			
			arr.add(str);
			
			System.out.print("Adicionar mais String? (1-Sim, 2-Não): ");
			continuar = scan.nextInt();
			scan.nextLine();
		} while(continuar == 1);
		
		for(String str : arr) {
			String upper = toUpper(str);
			System.out.println(upper);
		}
		
		scan.close();
	}
}