// 03) Crie uma lista de nomes e adicione/remova elementos dinamicamente.

package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void adicionarNome(ArrayList<String> nomes, Scanner scan) {
		System.out.print("Digite o nome: ");
		String nome = scan.nextLine();
		while(nome.trim().isEmpty()) {
		    System.out.print("Insira um nome válido: ");
		    nome = scan.nextLine();
		}
		nomes.add(nome);
	}
	
	public static void removerNome(ArrayList<String> nomes, Scanner scan) {
		if(nomes.isEmpty()) {
			System.out.println("Não há nomes adicionados.");
			return;
		}
		
		listarNomes(nomes);
		
		System.out.print("Selecione o índice do nome: ");
		int idx = scan.nextInt();
		while(idx<1 || idx>nomes.size()) {
			System.out.print("Opção inválida, tente novamente: ");
			idx = scan.nextInt();
		}
		scan.nextLine();
		
		String removido = nomes.remove(idx-1);
		
		System.out.println(removido + " foi removido");
	}
	
	public static void listarNomes(ArrayList<String> nomes) {
		if(nomes.isEmpty()) {
			System.out.println("Não há nomes adicionados.");
			return;
		}
		
		int i = 1;
		for(String nome : nomes) {
			System.out.println(i + ": " + nome);
			i++;
		}
	}
	
	
	public static void menu() {
		ArrayList<String> nomes = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int opc = 1;
		
		do {
			
			System.out.println("MENU:");
			System.out.println("1 - Adicionar nome");
			System.out.println("2 - Remover nome");
			System.out.println("3 - Listar nomes");
			System.out.println("4 - Sair");
			System.out.print("Selecione uma opção: ");
			opc = scan.nextInt();
			scan.nextLine();
			
			while(opc<1 || opc>4) {
				System.out.print("Opção inválida, tente novamente: ");
				opc = scan.nextInt();
			}
			scan.nextLine();
			
			switch(opc) {
				case 1 : {
					adicionarNome(nomes, scan);
					break;
				}
				case 2: {
					removerNome(nomes, scan);
					break;
				}
				case 3: {
					listarNomes(nomes);
					break;
				}
				default: {
					break;
				}
			} 
		} while(opc!=4);
	}
	public static void main(String[] args) {
		menu();
		
	}
}