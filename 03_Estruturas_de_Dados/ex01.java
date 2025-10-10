// 01) Crie um ArrayList de inteiros e calcule a soma de todos os elementos.

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		int continuar = 1;
		
		do {
			System.out.print("Número: ");
			int num = scan.nextInt();
			arr.add(num);
			
			System.out.print("Deseja continuar? (1-Sim, 2-Não): ");
			continuar = scan.nextInt();
		} while(continuar == 1);
		
		int s = 0;
		
		for(int num : arr) {
			s += num;
		}
		
		System.out.println(s);
		
		scan.close();
	}
}