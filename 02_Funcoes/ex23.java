// 23) Função recursiva somarArrayRecursivo.

import java.util.Scanner;

public class Solution {
	public static int somarArrayRecursivo(int arr[], int i) {
		if(i<0) return 0;

		return arr[i] + somarArrayRecursivo(arr, i-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		
		scan.close();
		
		int arr[] = new int[len];
		
		System.out.print("Array = [");
		for(int i=0; i<len; i++) {
			arr[i] = (int)(Math.random()*100.0);
			System.out.print(arr[i]);
			if(i<len-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		
		
		int s = somarArrayRecursivo(arr, len-1);
		
		System.out.println("S = " + s);
	}
}