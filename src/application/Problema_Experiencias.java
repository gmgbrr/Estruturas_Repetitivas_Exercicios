package application;

import java.util.Scanner;

public class Problema_Experiencias {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X, quantidade, animal[] = new int[3], total = 0;
		char idAnimal;
		
		System.out.println("Quantos casos de teste serão digitados?");
			X = scan.nextInt();
		
		for(int n = 0; n < X; n++) {
			System.out.println("Quantidade de cobaias: ");
				quantidade = scan.nextInt();
			 System.out.println("Tipo de cobaia: ");
				 idAnimal = scan.next().charAt(0);
			total += quantidade;
			
			switch(idAnimal) {
				case 'C':
					animal[0] += quantidade; //Coelhos
					break;
				case 'R':
					animal[1] += quantidade; //Ratos
					break;
				case 'S':
					animal[2] += quantidade; //Sapos
					break;
				default:
					break;
			}

		}
		 scan.close();
				
		System.out.println("RELATÓRIO FINAL: ");
			System.out.printf("Total: %d cobaias\n", total);
				System.out.printf("Total de coelhos: %d\n", animal[0]);
				 System.out.printf("Total de ratos: %d\n", animal[1]);
				  System.out.printf("Total de sapos: %d\n", animal[2]);
				  		System.out.printf("Percentual de coelhos: %.2f\n", (double)animal[0] / total * 100);
				  		 System.out.printf("Percentual de ratos: %.2f\n", (double)animal[1] / total * 100);
				  		  System.out.printf("Percentual de sapos: %.2f\n", (double)animal[2] / total * 100); 
				  		  
	}

}
