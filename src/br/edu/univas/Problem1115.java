package br.edu.univas;

import java.util.Scanner;

public class Problem1115 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int A ,B;

		while (((A = input.nextInt()) != 0) && ((B = input.nextInt()) != 0)) {

			if (A > 0 && B > 0) {

				System.out.println("primeiro");

			} else if (A < 0 && B > 0) {

				System.out.println("segundo");

			} else if (A < 0 && B < 0) {

				System.out.println("terceiro");

			} else if (A > 0 && B < 0) {

				System.out.println("quarto");

			}

		}
		input.close();
	}
}