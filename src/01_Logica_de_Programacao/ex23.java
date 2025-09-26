// 23) Faça um programa que some números digitados até que o usuário digite zero.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = 0;
		int num = 1;
		do {
			num = scan.nextInt();
			s += num;
		} while(num!=0);
		scan.close();
		System.out.println(s);
	}
}