package application;

import java.util.Scanner;

public class Problema_Quadrante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			
		int coord[] = {1,1};
		
		while(coord[0] != 0 && coord[1] != 0) {
			System.out.println("Digite os valores das coordenadas X e Y: ");
				coord[0] = scan.nextInt();
				 coord[1] = scan.nextInt();
			
			if (coord[0] > 0 && coord[1] > 0) {
				System.out.println("QUADRANTE Q1");
			} else if (coord[0] < 0 && coord[1] > 0) {
				System.out.println("QUADRANTE Q2");
			} else if (coord[0] < 0 && coord[1] < 0) {
				System.out.println("QUADRANTE Q3");
			} else if (coord[0] > 0 && coord[1] < 0) {
				System.out.println("QUADRANTE Q4");
			}
		}
		 scan.close();
			
	}

}
