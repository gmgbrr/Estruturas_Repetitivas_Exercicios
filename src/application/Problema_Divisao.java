package application;

import java.util.Scanner;

public class Problema_Divisao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int casos; 
		double numerador, denominador;
		
		System.out.println("Quantos casos voc� vai digitar?");
			casos = scan.nextInt();
		 
		for(int i = 0; i < casos; i++) {
			
			System.out.println("Entre com o numerador: ");
				numerador = scan.nextDouble();
			 System.out.println("Entre com o denominador: ");
				 denominador = scan.nextDouble();
				 
			if(denominador == 0) {
				System.out.println("DIVIS�O IMPOSS�VEL\n");
			} else {
				System.out.printf("DIVIS�O = %.2f\n\n", numerador / denominador);
			}		
			
		}
		
		scan.close();
		
	}

}
