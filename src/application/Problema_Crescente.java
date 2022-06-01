package application;

import java.util.Scanner;

public class Problema_Crescente {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num[] = {0,1};
		
		while (num[0] != num[1]) {
			System.out.println("Digite os dois números: ");
				num[0] = scan.nextInt();
				 num[1] = scan.nextInt();
				 
			if (num[0] > num[1]) {
				System.out.println("DECRESCENTE!");
			} else if (num[1] > num[0]) {
				 System.out.println("CRESCENTE");
			  }
			
		}
				
		scan.close();

	}

}