package br.edu.univas;

import java.util.Scanner;

public class Problem1064 {

	public static void main(String[] args) {
		float N,total = 0,media = 0;
		int cont = 0;
		Scanner sc =new Scanner(System.in);
		for (int i = 1; i <= 6; i++) {
			N = sc.nextFloat();
			if (N > 0) {
				cont += 1;
				total += N;
			}
		}
		sc.close();
		media = total / cont;
		
		System.out.println(cont+" valores positivos");
		System.out.printf("%.1f\n",media);

	}

}
