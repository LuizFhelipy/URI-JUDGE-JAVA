package br.edu.univas;

import java.util.Scanner;

public class Problem1041 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float x = input.nextFloat();
		float y = input.nextFloat();

		input.close();

		if (x == 0 && y == 0) {

			System.out.printf("Origem\n");

		} else if (x == 0) {

			System.out.printf("Eixo Y\n");

		} else if (y == 0) {

			System.out.printf("Eixo X\n");

		} else if (x > 0 && y > 0) {

			System.out.printf("Q1\n");

		} else if (x > 0 && y < 0) {

			System.out.printf("Q4\n");

		} else if (x < 0 && y > 0) {

			System.out.printf("Q2\n");

		} else {

			System.out.printf("Q3\n");

		}

	}
}
