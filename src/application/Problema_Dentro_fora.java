package application;

import java.util.Scanner;

public class Problema_Dentro_fora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N, X, dentro = 0, fora = 0;
		
		
		System.out.println("Quantos n�meros voc� vai digitar?");
			N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Digite um n�mero: ");
				X = scan.nextInt();
			if(X >= 10 && X <= 20) {
				dentro++;
			} else {
				fora++;
			}
		
		}
		
		scan.close();
		 System.out.printf("%d DENTRO\n%d FORA", dentro, fora);
			
	}

}