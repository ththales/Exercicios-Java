// 05) Inverta um array de inteiros sem usar métodos prontos.

package ex05;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
	public static void inverterArray(ArrayList<Integer> arr) {
		if(arr.isEmpty()) {
			throw new IllegalArgumentException("O array está vazio!");
		}
		for (int i=0, j=arr.size()-1; i<j; i++, j--) {
		    int aux= arr.get(i);
		    arr.set(i, arr.get(j));
		    arr.set(j, aux);
		}
	}
	public static void lerDados(ArrayList<Integer> arr, Scanner scan) {
		int continuar = 1;
		do {
			System.out.print("Valor: ");
			int valor = scan.nextInt();
			arr.add(valor);
			System.out.print("Deseja continuar lendo? (1-Sim, 2-Não): ");
			continuar = scan.nextInt();
		}while(continuar==1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		lerDados(arr, scan);
		System.out.println("Array original: " + arr);
		inverterArray(arr);
		System.out.println("Array invertido: " + arr);
	}
}