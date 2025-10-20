// 07) Crie um HashMap que armazene nomes e idades, e imprima todas as entradas.

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void buscarPessoas(HashMap<String, Integer> pessoas) {
		for(String chaveNome : pessoas.keySet()) {
			System.out.println(chaveNome + ": " + pessoas.get(chaveNome));
		}
	}
	public static void lerPessoas(HashMap<String, Integer> pessoas, Scanner scan) {
		int continuar = 1;
		do {
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			if (nome.isBlank()) {
			    System.out.println("Nome inválido, tente novamente.");
			    continue;
			}
			
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			if (idade < 0) {
			    System.out.println("Idade inválida, tente novamente.");
			    continue;
			}
			
			pessoas.put(nome, idade);
			
			System.out.print("Continuar inserindo valores? (1-Sim, 2-Nao): ");
			continuar = scan.nextInt();
			scan.nextLine();
		}while(continuar==1);
	}
	public static void main(String[] args) {
		HashMap<String, Integer>pessoas = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		lerPessoas(pessoas, scan);
		
		buscarPessoas(pessoas);
		
		scan.close();
	}
}