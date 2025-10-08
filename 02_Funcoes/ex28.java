// 28) Função que recebe um array e retorna o índice do maior elemento.

import java.util.Scanner;

public class Solution {
	public static int maiorArr(int arr[]) {
		int maior = arr[0];
		int index = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>maior) {
				maior = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		
		int arr[] = new int[len];
		
		System.out.print("Array = [");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]);
			if(i<len-1) {
				System.out.print(',');
			}
		}
		System.out.println("]");
		
		int indexMaior = maiorArr(arr);
		
		System.out.println("Index maior = " + indexMaior);
		
		scan.close();
		
	}
}