package br.edu.univas;

import java.util.Scanner;

public class Problem1080 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maior=0,pos=0;
		
		
		
		for(int i = 1; i <= 100;i++) {
			int N = scan.nextInt();
			
			if(i==1) {
				maior = N;
				pos = i;
			}
			
			if(N > maior) {
				maior = N;
				pos = i;
			}
		}
		scan.close();
		System.out.println(maior);
		System.out.println(pos);
	}
}
