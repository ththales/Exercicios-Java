// 14) Função maiorArray que recebe um array e retorna o maior valor.

import java.util.Scanner;

public class Solution {
	public static int maiorArray(int arr[]) {
		int maior = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>maior) {
				maior = arr[i];
			}
		}
		return maior;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int arr[] = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int maior = maiorArray(arr);
		System.out.println(maior);
	}
}