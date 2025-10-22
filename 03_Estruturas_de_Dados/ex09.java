// 09) Atualize a idade de um nome no Map.

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void listarDados(HashMap<String, Integer> map) {
		if(map.isEmpty()) {
			System.out.println("Não há dados adicionados! Adicione para continuar...");
			return;
		}
		
		System.out.println("--- Lista de Dados ---");
		for(String nome : map.keySet()) {
			System.out.println(nome + ": " + map.get(nome));
		}
	}
	public static void editarDados(HashMap<String, Integer> map, Scanner scan) {
		listarDados(map);
		
		if(map.isEmpty()) return;
		
		System.out.println("Selecione alguém para atualizar sua idade: ");
		String key = scan.nextLine();
		while(key.isBlank()) {
			System.out.print("Nome inválido, tente novamente: ");
			key = scan.nextLine();
		}
		while(!map.containsKey(key)) {
		    System.out.print("Nome não encontrado! Digite um nome existente: ");
		    key = scan.nextLine();
		}
		
		System.out.print("Digite a nova idade: ");
		int novaIdade = scan.nextInt();
		while(novaIdade<=0) {
			System.out.print("Idade inválida, tente novamente: ");
			novaIdade = scan.nextInt();
		}
		
		map.put(key, novaIdade);
	}
	public static void lerDados(HashMap<String, Integer> map, Scanner scan) {
		int continuar = 1;
		do {
			System.out.print("Digite um nome: ");
			String nome = scan.nextLine();
			while(nome.isBlank()) {
				System.out.print("Nome inválido, tente novamente: ");
				nome = scan.nextLine();
			}
			
			System.out.print("Digite a idade do(a) " + nome + ": ");
			int idade = scan.nextInt();
			while(idade<=0) {
				System.out.print("Idade inválida, tente novamente: ");
				idade = scan.nextInt();
			}
			
			scan.nextLine();
			
			map.put(nome, idade);
			
			System.out.print("Continuar inserindo valores? (1-Sim, 2-Não): ");
			continuar = scan.nextInt();
			
			scan.nextLine();
		}while(continuar==1);
	}
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		int opc = 0;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1 - Adicionar dados");
			System.out.println("2 - Atualizar idade");
			System.out.println("3 - Visualizar dados");
			System.out.println("4 - Sair");
			
			System.out.print("Selecione uma opção: ");
			opc = scan.nextInt();
			
			scan.nextLine();
			
			switch(opc) {
				case 1: {
					lerDados(map, scan);
					System.out.println("Dados adicionados com sucesso!");
					break;
				}
				case 2: {
					editarDados(map, scan);
					break;
				}
				case 3: {
					listarDados(map);
					break;
				}
				case 4: {
					System.out.println("Saindo do programa...");
					break;
				}
				default: {
					System.out.println("Opção inválida!");
					break;
				}
			}
		} while(opc!=4);
		
		scan.close();
	}
}