// 17) Função inverterString que retorna a string invertida.

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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		String invStr = inverterString(str);
		System.out.println(invStr);
	}
}