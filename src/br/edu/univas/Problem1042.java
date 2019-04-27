package br.edu.univas;

import java.util.Scanner;

public class Problem1042 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();

		int n2 = input.nextInt();

		int n3 = input.nextInt();

		input.close();
		
		int min, mid, max;

		if ((n1 < n2) && (n1 < n3)) {
			min = n1;
			if (n2 < n3) {
				mid = n2;
				max = n3;
			} else {
				mid = n3;
				max = n2;
			}
		} else if ((n2 < n1) && (n2 < n3)) {
			min = n2;
			if (n1 < n3) {
				mid = n1;
				max = n3;
			} else {
				mid = n3;
				max = n1;
			}
		} else {
			min = n3;
			if (n1 < n2) {
				mid = n1;
				max = n2;
			} else {
				mid = n2;
				max = n1;
			}
		}
		System.out.printf("%d\n%d\n%d\n",min,mid,max);
		System.out.printf("\n%d\n%d\n%d\n",n1,n2,n3);
	}
}
