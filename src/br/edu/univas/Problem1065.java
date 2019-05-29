package br.edu.univas;

import java.util.Scanner;

public class Problem1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		for(int i = 0; i < 5;i++) {
			int N = scan.nextInt();
			
			if(N % 2 == 0) {
				cont++;
			}
		}
		scan.close();
		System.out.println(cont+" valores pares");
	}

}
