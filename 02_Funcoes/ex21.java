// 21) Função recursiva fatorialRecursivo.

import java.util.Scanner;

public class Solution {
	public static long fatorialRecursivo(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		return num * fatorialRecursivo(num-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		scan.close();
		long r = fatorialRecursivo(num);
		System.out.println(num + "! = " + r);
	}
}