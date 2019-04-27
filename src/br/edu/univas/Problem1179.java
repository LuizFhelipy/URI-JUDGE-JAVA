package br.edu.univas;

import java.util.Scanner;

public class Problem1179 {
	public static void main(String[] args) {
		int a, p, i, b, j;

		int par[] = new int[5];
		int impar[] = new int[5];

		p = 0;
		i = 0;
		Scanner scan = new Scanner(System.in);
		for (j = 0; j < 15; j++) {
			a = scan.nextInt();
			if (a % 2 == 0) {
				par[p] = a;
				p++;
			} else {
				impar[i] = a;
				i++;
			}

			if (p == 5) {
				b = 0;
				while (b < 5) {
					System.out.printf("par[%d] = %d\n", b, par[b]);
					b++;
				}
				p = 0;
			}
			if (i == 5) {
				b = 0;
				while (b < 5) {
					System.out.printf("impar[%d] = %d\n", b, impar[b]);
					b++;
				}
				i = 0;
			}
			if(j==14) {
				b = 0;
				while(b < i) {
					System.out.printf("impar[%d] = %d\n", b, impar[b]);
					b++;
				}
				b = 0;
				while(b < p) {
					System.out.printf("par[%d] = %d\n", b, par[b]);
					b++;
				}
			}
		}
		

		scan.close();
	}

}