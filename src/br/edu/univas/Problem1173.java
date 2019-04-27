package br.edu.univas;

import java.util.Scanner;

public class Problem1173 {
	public static void main(String[] args) {
		int vet[] = new int [10];
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(i==0) {
				vet[i] = N;
			} else {
				vet[i] = N+N;
				N = vet[i];
			}
			System.out.println("N[" + i + "] = " + vet[i]);
		}
		
		
		
		
		
		scan.close();
	}
}
