package br.edu.univas;

import java.util.Scanner;

public class Problem1176 {

	public static void main(String[] args) {
		long fib[] = new long[61];
		fib[0] = 0;
		fib[1] = 1;

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			System.out.printf("Fib(%d) = %d\n", N, fibb(N));
		}

		scan.close();
	}

	public static int fibb(int n) {

		if (n == 1 || n ==2) {
			return 1;
		} else if(n == 0) {
			return 0;
		}
		else {
			return fibb(n-1) + fibb(n-2);
		}
	}

}
