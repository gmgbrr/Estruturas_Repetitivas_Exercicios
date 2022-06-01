package application;

import java.util.Scanner;

public class Problema_Media_ponderada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, peso = 0;
		double media = 0;
		
		System.out.println("Quantos casos você vai digitar?");
			x = scan.nextInt();
			
		for(int z = 0; z < x; z++) {
			System.out.println("Digite três números: ");
				for(int i = 0; i < 3; i++) {
					switch (i) {
						case 0:
							peso = 2;
							break;
						case 1:
							peso = 3;
							break;
						case 2:
							peso = 5;
					}
					media += scan.nextDouble() * peso;
				
				}
					System.out.printf("MÉDIA = %.1f\n", media / 10);
						media = 0;
		}
		 scan.close();
		
	}

}