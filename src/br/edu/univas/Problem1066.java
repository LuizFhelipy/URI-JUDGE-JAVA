package br.edu.univas;

import java.util.Scanner;

public class Problem1066 {
	public static void main(String[] args) {
		
		int cont_impar = 0, cont_par = 0, cont_positivo = 0, cont_negativo = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			int N = scan.nextInt();
			
			if(N % 2 == 0) {
				cont_par++;
			}else {
				cont_impar++;
			}
			if(N < 0) {
				cont_negativo++;
			}else if(N > 0){
				cont_positivo++;
			}
		}
		scan.close();
		System.out.println(cont_par+" valor(es) par(es)\n"+
						   cont_impar+" valor(es) impar(es)\n"+
						   cont_positivo+" valor(es) positivo(s)\n"+
						   cont_negativo+" valor(es) negativo(s)");
	}
}
