package br.edu.univas;

import java.util.Scanner;

public class Problem1078 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		scan.close();
		
		for(int i = 1;i <=10;i++) {
			System.out.println(i+" x 140 = "+(i*N));
		}
	}

}
