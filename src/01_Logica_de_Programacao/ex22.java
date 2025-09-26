// 22) Faça um programa que continue pedindo um número positivo até o usuário digitar um.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
			num = scan.nextInt();
		}while(num<=0);
		scan.close();
	}
}