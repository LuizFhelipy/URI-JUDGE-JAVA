package br.edu.univas;

import java.util.*;

public class Problem1180 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menor,pos;
		int n;
		n = scan.nextInt();

		int x[] = new int[n];

		for (int i = 0; i < n; i++) {

			x[i] = scan.nextInt();

		}
		menor = x[0];
		pos = 0;
		for(int i = 1;i < n;i++) {
			if(x[i] < menor) {
				menor = x[i];
				pos = i;
			}
		}
		System.out.printf("Menor valor: %d\nPosicao: %d\n",menor,pos);
		
		
		
		scan.close();
	}
}
