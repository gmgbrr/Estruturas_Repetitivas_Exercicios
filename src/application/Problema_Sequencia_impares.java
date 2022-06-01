package application;

import java.util.Scanner;

public class Problema_Sequencia_impares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite o valor de X: ");
			x = scan.nextInt();
		 scan.close();
		 
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
			
			
		}

	}

}
