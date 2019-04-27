package br.edu.univas;

import java.util.Scanner;

	public class Problem2234 {
		public static void main(String[] args) {
			float a,b,t;
				Scanner scan = new Scanner(System.in);
			
				a = scan.nextFloat();
				b = scan.nextFloat();
			
				t=a/b;
			
					System.out.printf("%.2f\n",t);
				scan.close();
		}
}
