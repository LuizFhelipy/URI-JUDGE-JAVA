package br.edu.univas;

import java.util.Scanner;

public class Problem1020 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.close();
		
		int ano = N / 365;
		int mes = (N % 365) / 30;
		int dia = (N % 365) % 30;
		
		System.out.println(ano+" ano(s)\n"+mes+" mes(es)\n"+dia+" dia(s)");
	}
}
