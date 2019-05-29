package br.edu.univas;

import java.util.Scanner;

public class Problem1067 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		scan.close();
		
		for(int i = 1; i <= N; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
