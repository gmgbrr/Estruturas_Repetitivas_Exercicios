package application;

import java.util.Scanner;

public class Problema_Pares_consecutivos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = 1, soma = 0;
		
		
		while(x != 0) {
			System.out.println("Digite um número inteiro: ");
				x = scan.nextInt();				
				
			if (x == 0){
				System.exit(0);
			} else if (x % 2 == 0) {
				soma += x * 5 + 20;
					System.out.printf("SOMA = %d\n", soma);
			} else if (x % 2 != 0) {
				soma += x * 5 + 25;
					System.out.printf("SOMA = %d\n", soma);
			} 
			 soma = 0;
		}
		 scan.close();
		 
	}

}
