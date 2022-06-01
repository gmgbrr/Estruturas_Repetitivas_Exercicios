package application;

import java.util.Scanner;

public class Problema_Senha_fixa {

	static final int SENHA = 2002;
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int tentativa;
		
		System.out.println("Digite a senha: ");
			tentativa = scan.nextInt();		
			
		while (tentativa != SENHA) {
			System.out.println("Senha Inválida! Tente novamente: ");
			tentativa = scan.nextInt();
		}
		
		scan.close();
		System.out.println("Acesso permitido!");
		
	}

}