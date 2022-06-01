package application;

import java.util.Scanner;

public class Problema_Tabuada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, calculo;
		
		System.out.println("Deseja a tabuada para qual valor?");
			num = scan.nextInt();
		 scan.close();
		 
		for(int i = 1; i <= 10; i++) {
			calculo = num * i;
				System.out.printf("%d x %d = %d\n", num, i, calculo);
		}
		
	}

}