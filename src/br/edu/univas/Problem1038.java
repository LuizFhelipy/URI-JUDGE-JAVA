package br.edu.univas;

import java.util.Scanner;

public class Problem1038 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cod = input.nextInt();
		int x = input.nextInt();
		input.close();
		double total = 0;
		if(cod == 1) {
			 total = 4.00 * x ;
		}else if(cod == 2) {
			 total = 4.50 * x;
		}else if(cod == 3) {
			 total = 5.00 * x;
		}else if(cod == 4) {
			 total = 2.00 * x;
		}else if(cod == 5){
			total = 1.50 * x;
		}
		System.out.printf("Total: R$ %.2f\n",total);
	}
}
