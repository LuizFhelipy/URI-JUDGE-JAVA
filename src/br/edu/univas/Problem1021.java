package br.edu.univas;

import java.util.Scanner;

public class Problem1021 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		double N = scan.nextDouble();
		scan.close();
		
		double centavos = N*100;
		
		double nota100 = N / 100.00;
		N %= 100;
		double nota50 = N / 50.00;
		N%= 50;
		double nota20 = N / 20.00;
		N%= 20;
		double nota10 = N / 10.00;
		N%= 10;
		double nota5 = N / 5.00;
		N%= 5;
		double nota2 = N / 2.00;
		N%=2;
		double nota1 = N / 1.00;
		
		centavos = centavos % 100;
		
		double moeda50 = centavos / 50;
        centavos %= 50;
        double moeda25 = centavos / 25;
        centavos %= 25;
        double moeda10 = centavos / 10;
        centavos %= 10;
        double moeda5 = centavos / 5;
        centavos %= 5;
        double moeda1 = centavos;
		
        System.out.println("NOTAS:");
        System.out.println((int)nota100 + " nota(s) de R$ 100.00");
        System.out.println((int)nota50 + " nota(s) de R$ 50.00");
        System.out.println((int)nota20 + " nota(s) de R$ 20.00");
        System.out.println((int)nota10 + " nota(s) de R$ 10.00");
        System.out.println((int)nota5 + " nota(s) de R$ 5.00");
        System.out.println((int)nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)nota1 + " moeda(s) de R$ 1.00");
        System.out.println((int)moeda50 + " moeda(s) de R$ 0.50");
        System.out.println((int)moeda25 + " moeda(s) de R$ 0.25");
        System.out.println((int)moeda10 + " moeda(s) de R$ 0.10");
        System.out.println((int)moeda5 + " moeda(s) de R$ 0.05");
        System.out.println((int)moeda1 + " moeda(s) de R$ 0.01");

	}
}
