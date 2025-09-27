// 20) Função fibonacci que retorna o n-ésimo número de Fibonacci (iterativo).

import java.util.Scanner;

public class Solution {
	public static int fibonacci(int num) {
		if(num==0) return 0;
		if(num==1) return 1;
		
		int ant = 0;
		int prox = 1;
		int fib = 0;
		
		for(int i=2; i<=num; i++) {
			fib = ant+prox;
			ant = prox;
			prox = fib;
		}
		return fib;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int r = fibonacci(num);
		System.out.println(r);
	}
}