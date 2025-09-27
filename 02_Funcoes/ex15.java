// 15) Função menorArray que recebe um array e retorna o menor valor.

import java.util.Scanner;

public class Solution {
	public static int menorArray(int arr[]) {
		int menor = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<menor) {
				menor = arr[i];
			}
		}
		return menor;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int arr[] = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int menor = menorArray(arr);
		System.out.println(menor);
	}
}