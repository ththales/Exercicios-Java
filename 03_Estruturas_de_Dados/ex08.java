// 08) Verifique se uma chave específica existe no Map.

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static boolean verificarChave(HashMap<String, String> map, Scanner scan) {
		System.out.print("Digite uma chave para verificar se está no HashMap: ");
		String keyUser = scan.nextLine();
		return map.containsKey(keyUser);
	}
	public static void lerDados(HashMap<String, String> map, Scanner scan) {
		int continuar = 1;
		do {
			System.out.print("Key: ");
			String key = scan.nextLine();
			if (key.isBlank()) {
			    System.out.println("Key inválida, tente novamente.");
			    continue;
			}
			
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			if (nome.isBlank()) {
			    System.out.println("Nome inválida, tente novamente.");
			    continue;
			}
			
			map.put(key, nome);
			
			System.out.print("Continuar inserindo valores? (1-Sim, 2-Nao): ");
			continuar = scan.nextInt();
			scan.nextLine();
		}while(continuar==1);
	}
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		int opc = 1;
		
		do {
			System.out.println("--- Menu ---");
			System.out.println("1 - Adicionar valores");
			System.out.println("2 - Verificar chave");
			System.out.println("3 - Sair");
			
			System.out.print("Selecione uma opção: ");
			opc = scan.nextInt();
			scan.nextLine();
			
			switch(opc) {
				case 1: {
					lerDados(map, scan);
					System.out.println("Valores adicionados com sucesso!");
					break;
				}
				case 2: {
					if(verificarChave(map, scan)) {
						System.out.println("Chave está no Hash Map!");
					}
					else {
						System.out.println("Chave não está no Hash Map!");
					}
					
					break;
				}
				case 3: {
					System.out.println("Saindo...");
					break;
				}
				default: {
					System.out.println("Opção inválida!");
					break;
				}
			}
		}while(opc!=3);
		
		scan.close();
		
	}
}