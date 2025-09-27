// 13) Função somarArray que recebe um array de inteiros e retorna a soma.

import java.util.Scanner;

public class Solution {
	public static int somarArray(int arr[]) {
		int s = 0;
		for(int i=0; i<arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int arr[] = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int r = somarArray(arr);
		System.out.println(r);
	}
}