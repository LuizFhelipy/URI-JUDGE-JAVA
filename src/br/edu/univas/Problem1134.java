package br.edu.univas;

import java.util.Scanner;

public class Problem1134 {
	public static void main(String[] args) {
		int alc = 0, gas = 0, dis = 0, N = 0;
		Scanner scan = new Scanner(System.in);
		while (N != 4) {
			N = scan.nextInt();
			if(N==1) {
				alc+=1;
			}else if(N==2) {
				gas+=1;
			}else if(N==3) {
				dis+=1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alc);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+dis);

		scan.close();
	}
}
