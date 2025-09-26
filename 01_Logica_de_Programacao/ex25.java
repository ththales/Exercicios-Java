// 25) Faça um jogo de adivinhação: o usuário deve acertar um número secreto.

import java.util.Scanner;
import java.util.Random;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int target = rand.nextInt(31); 
		int num = 0;
		System.out.println("Jogo da adivinhação:");
		System.out.println("Adivinhe o número que pensei de 0 a 30");
		do {
			System.out.print("Chute um número:");
			num = scan.nextInt();
			if(num<target) {
				System.out.println("O número secreto é maior!");
			}
			else if (num>target) {
				System.out.println("O número secreto é menor!");
			}
		}while(num!=target);
		System.out.printf("Você adivinhou meu numero que pensei, de fato é %d%n", target);
	}
}