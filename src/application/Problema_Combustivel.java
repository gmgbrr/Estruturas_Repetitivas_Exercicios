package application;

import java.util.Scanner;

public class Problema_Combustivel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int escolha = 0, combustiveis[] = new int[3];
		
		
		
		while (escolha != 4) {
			System.out.println("Informe um código (1, 2, 3) ou 4 para parar: ");
				escolha = scan.nextInt();
				
			switch (escolha) {
				case 1:
					combustiveis[0]++; //Alcool
					break;
				case 2:
					combustiveis[1]++; //Gasolina
					break;
				case 3:
					combustiveis[2]++; //Diesel
					break;
				case 4:
					System.out.println("MUITO OBRIGADO");
					break;
				default:
					break;
			}
	
		}
		scan.close();
		System.out.printf("Alcool: %d\n", combustiveis[0]);
		 System.out.printf("Gasolina: %d\n", combustiveis[1]);
		  System.out.printf("Diesel: %d", combustiveis[2]);

	}

}