// 04) Dado um array de inteiros, encontre o maior valor.

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
	public static int maiorValor(ArrayList<Integer> arr) {
		if(arr.isEmpty()) {
			throw new IllegalArgumentException("O array está vazio!");
		}
		int maior = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
		    if (arr.get(i) > maior) maior = arr.get(i);
		}
		return maior;
	}
	public static void imprimirArray(ArrayList<Integer> arr) {
		System.out.println("Array: " + arr);
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
		imprimirArray(arr);
		int maiorArr = maiorValor(arr);
		System.out.println("Maior valor: " + maiorArr);
		scan.close();
	}
}