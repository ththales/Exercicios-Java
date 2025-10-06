// 22) Função recursiva fibonacciRecursivo.

import java.util.Scanner;

public class Solution {
	public static int fibonacciRecursivo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int index = scan.nextInt();
		
		scan.close();
		
		int fib = fibonacciRecursivo(index);
		
		System.out.println(fib);
	}
}