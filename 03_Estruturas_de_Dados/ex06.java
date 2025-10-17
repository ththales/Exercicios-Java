// 06) Crie uma lista de inteiros e remova todos os números pares.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
	public static void removerPares(ArrayList<Integer> arr) {
	    Iterator<Integer> it = arr.iterator();
	    while(it.hasNext()) {
	        if (it.next()%2==0) {
	            it.remove();
	        }
	    }
	}
	public static void lerArray(ArrayList<Integer> arr, Scanner scan) {
		int continuar = 1;
		do {
			System.out.print("Valor: ");
			int valor = scan.nextInt();
			arr.add(valor);
			System.out.print("Continuar inserindo? (1-Sim, 2-Não): ");
			continuar = scan.nextInt();
		} while(continuar==1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		lerArray(arr, scan);
		System.out.println("Array original: " + arr);
		removerPares(arr);
		System.out.println("Array sem pares: " + arr);
		scan.close();
	}
}