package application;

import java.util.Scanner;

public class Problema_Soma_impares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y, troca, total = 0;
		
		System.out.println("Digite dois números: ");
			x = scan.nextInt();
			 y = scan.nextInt();
		 scan.close();
		 
			if(x > y) {
				troca = x;
				 x = y;
				  y = troca;				 	 
			 }
			 
			 for(int i = x+1; i < y; i++) {		 		 
				 if (i % 2 != 0) {
					 total += i; 
				 } 
			 }
			 	
			 System.out.printf("SOMA DOS IMPARES = %d\n", total);
			 
			 
	}

}
