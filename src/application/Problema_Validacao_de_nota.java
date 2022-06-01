package application;

import java.util.Scanner;

public class Problema_Validacao_de_nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double notas[] = new double[2];
		
		
		System.out.println("Digite a primeira nota: ");
			do {				
				notas[0] = scan.nextDouble();
					if (notas[0] < 0 || notas[0] > 10) {
						System.out.println("Valor inválido! Tente novamente: ");
					}				
			} while (notas[0] < 0 || notas[0] > 10);
			
		System.out.println("Digite a segunda nota: ");
			do {				
				notas[1] = scan.nextDouble();
					if (notas[1] < 0 || notas[1] > 10) {
						System.out.println("Valor inválido! Tente novamente: ");
					}				
			} while (notas[1] < 0 || notas[1] > 10);
	
		System.out.printf("MÉDIA = %.2f",(notas[1] + notas[0]) / 2);
		 scan.close();
	}

}