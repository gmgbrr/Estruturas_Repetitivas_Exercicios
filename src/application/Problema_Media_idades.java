package application;

import java.util.Scanner;

public class Problema_Media_idades {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double media, idade = 0;
		int cont = 0, soma = 0;
		
		System.out.println("Digite as idades: ");
				
		while (soma >= 0) {
			soma = scan.nextInt();
			 if(soma >= 0) {					  
				 idade += soma;
				  cont++;
			 }
		}
		 scan.close();
		
		if (cont > 0) {
			media = idade / cont;
				System.out.printf("MEDIA = %.2f", media);
		} else {
			System.out.println("IMPOSSÍVEL CALCULAR");
		}
		
		 
		 
		 
	}

}
