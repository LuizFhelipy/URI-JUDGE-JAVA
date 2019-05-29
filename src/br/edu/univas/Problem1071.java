package br.edu.univas;

import java.util.Scanner;

public class Problem1071 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int N1 = scan.nextInt();

		scan.close();

		int soma = 0;

		if (N > N1) {
			for (int i = N - 1; i > N1; i--) {
				if (i % 2 != 0) {
					soma += i;
				}
			}

		} else {
			for (int i = N1 - 1; i > N; i--) {
				if (i % 2 != 0) {
					soma += i;
				}
			}

		}
		System.out.println(soma);
	}
}
