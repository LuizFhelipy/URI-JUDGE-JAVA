package br.edu.univas;

import java.util.Scanner;

public class Problem1070 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for(int i = N; i < N+12;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}