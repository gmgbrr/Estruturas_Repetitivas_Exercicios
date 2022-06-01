package application;

import java.util.Scanner;

public class Problema_Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N, fatorial = 1;
		
		System.out.println("Digite o valor de N: ");
			N = scan.nextInt();
		scan.close();
		
			for(int i = 1; i < N; i++) {
				fatorial += fatorial * i;							
			}
		
		System.out.printf("FATORIAL = %d", fatorial);
	}

}
