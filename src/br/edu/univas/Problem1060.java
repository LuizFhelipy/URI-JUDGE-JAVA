package br.edu.univas;

import java.util.Scanner;

public class Problem1060 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double N;
		int cont = 0;
		
		for(int i = 0; i < 6;i++) {
			N = scan.nextDouble();
			
			if(N > 0) cont++;
			
		}
		
		System.out.printf("%d valores positivos\n",cont);
		
		scan.close();
	}

}
