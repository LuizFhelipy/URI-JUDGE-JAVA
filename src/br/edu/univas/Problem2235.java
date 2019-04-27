package br.edu.univas;

import java.util.*;

public class Problem2235 {
		public static void main(String[] args) {
			int a;
			int b;
			int c;
			Scanner scan = new Scanner(System.in);
			
				a= scan.nextInt();
				b= scan.nextInt();
				c= scan.nextInt();
		
		if((a>=1) && (a<=1000) && (b>=1) && (b<=1000) && (c>=1) && (c<=1000)) {
			
			if((a - b == 0) || (a - c == 0) || (b - c == 0) || (a + b - c ==0) || (a + c - b == 0) || (b + c - a == 0)) {
				System.out.println("S");
			} else {
				System.out.println("N");
			}
			
			
		}
		scan.close();
	}
}