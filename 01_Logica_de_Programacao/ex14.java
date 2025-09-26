// 14) Crie um sistema simples de login com usuário e senha.

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String emailSalvo = "teste123@gmail.com";
		String senhaSalva = "testeSenha123";
		
		String email = scan.nextLine();
		if(email.length()==0 || email==null) {
			System.out.println("E-mail não pode ser vazio.");
		}
		
		String senha = scan.nextLine();
		if(senha.length()==0 || senha==null) {
			System.out.println("Senha não pode ser vazia.");
		}
		scan.close();
		
		if(email.equals(emailSalvo) && senha.equals(senhaSalva)) {
			System.out.println("Login realizado com sucesso.");
		}
		else {
			System.out.println("Credenciais incorretas.");
		}
	}
}