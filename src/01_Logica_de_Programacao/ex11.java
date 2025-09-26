// 11) Faça um programa que verifica se a pessoa pode votar (idade >= 16).

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = scan.nextInt();
		scan.close();
		if(idade>=16) {
			System.out.println("Você pode votar!");
		}
		else {
			System.out.println("Você não pode votar!");
		}
	}
}