package application;

import java.util.Scanner;

public class Problema_Par_impar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, num;
		
		
		System.out.println("Quantos números você vai digitar?");
			x = scan.nextInt();

			for(int i = 0; i < x; i++) {
				System.out.println("Digite um número: ");
					num = scan.nextInt();
					
				if (num == 0) {
					System.out.println("NULO");			
				} else if (num % 2 == 0) {
						if(num > 0) {
							System.out.println("PAR POSITIVO");
						} else {
							System.out.println("PAR NEGATIVO");
						}
									
				} else {
						if(num > 0) {
							System.out.println("IMPAR POSITIVO");
						} else {
							System.out.println("IMPAR NEGATIVO");
						}
				}
			
			}	
		
		 scan.close();
			
	}

}
