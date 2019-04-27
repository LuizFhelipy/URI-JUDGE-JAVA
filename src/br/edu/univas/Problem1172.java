package br.edu.univas;

import java.util.Scanner;

public class Problem1172 {

	public static void main(String[] args) {
		int vet[] = new int[10];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			
			vet[i] = scan.nextInt();
			
			if (vet[i] <= 0) {
				
				vet[i] = 1;
				
			}
			System.out.println("X[" + i + "] = " + vet[i]);
		}
		scan.close();
	}

}
