package br.edu.univas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1079 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		
		DecimalFormat df =  new DecimalFormat("0.0");
		
		for(int i = 0;i < N; i++) {
			
			float n1 = scan.nextFloat();
			float n2 = scan.nextFloat();
			float n3 = scan.nextFloat();
			float media = (n1*2+n2*3+n3*5) / (10);
			
			System.out.printf(df.format(media));
		}
		scan.close();
	}

}
