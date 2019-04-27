package br.edu.univas;

import java.util.Scanner;

public class Problem1040 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float N1 = input.nextFloat();

		float N2 = input.nextFloat();

		float N3 = input.nextFloat();

		float N4 = input.nextFloat();

		float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

		if (media >= 7.0) {

			System.out.printf("Media: %.1f\n", media);

			System.out.print("Aluno aprovado.\n");

		}

		else if (media >= 5.0 && media <= 6.9) {

			System.out.printf("Media: %.1f\n", media);

			System.out.print("Aluno em exame.\n");

			float exame = input.nextFloat();

			System.out.printf("Nota do exame: %.1f\n", exame);

			float mediaf = (media + exame) / 2;

			if (mediaf >= 5.0) {

				System.out.print("Aluno aprovado.\n");

			} else {

				System.out.print("Aluno reprovado.\n");

			}

			System.out.printf("Media final: %.1f\n", mediaf);

		}

		else if (media < 5.0) {

			System.out.printf("Media: %.1f\n",media);

			System.out.print("Aluno reprovado.\n");

		}
		input.close();
	}
}