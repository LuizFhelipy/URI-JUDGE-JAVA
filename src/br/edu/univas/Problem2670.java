package br.edu.univas;

import java.util.Scanner;

public class Problem2670 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a1, a2, a3, s1 = 0, s2 = 0, s3 = 0;
		a1 = ler.nextInt();
		a2 = ler.nextInt();
		a3 = ler.nextInt();
		ler.close();
		s1 = a2 * 2 + a3 * 4;
		s2 = a1 * 2 + a3 * 2;
		s3 = a1 * 4 + a2 * 2;

		if (s1 < s2 && s1 <= s3) {
			System.out.println(s1);
		} else if (s2 <= s1 && s2 <= s3) {
			System.out.println(s2);
		} else {
			System.out.println(s3);
		}
	}
}
