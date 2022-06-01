package application;

import java.util.Scanner;

public class Problema_Divisao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int casos; 
		double numerador, denominador;
		
		System.out.println("Quantos casos você vai digitar?");
			casos = scan.nextInt();
		 
		for(int i = 0; i < casos; i++) {
			
			System.out.println("Entre com o numerador: ");
				numerador = scan.nextDouble();
			 System.out.println("Entre com o denominador: ");
				 denominador = scan.nextDouble();
				 
			if(denominador == 0) {
				System.out.println("DIVISÃO IMPOSSÍVEL\n");
			} else {
				System.out.printf("DIVISÃO = %.2f\n\n", numerador / denominador);
			}		
			
		}
		
		scan.close();
		
	}

}
