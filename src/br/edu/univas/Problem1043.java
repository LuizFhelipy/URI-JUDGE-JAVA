package br.edu.univas;

import java.util.Scanner;

public class Problem1043 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float A = input.nextFloat();
		float B = input.nextFloat();
		float C = input.nextFloat();
		
		input.close();
		
		if ((A < (float) (B + C)) && (B < (float) (A + C)) && (C < (float) (B + A))) {
			// Triangle perimeter = a + b + c;
			// Traphisium area is = (a + b)*h/2
			float perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);

		} else {
			float area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
	}
}
