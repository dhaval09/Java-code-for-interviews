package javaapplication21;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

public class fizzbuzz {
	public static void main(String[] args) {       
		String numbers = "2 4 15";
		String[] tokens = numbers.split(" ");
		int[] ary = new int[tokens.length];

		int ji = 0;
		for (String token : tokens) {
			ary[ji++] = Integer.parseInt(token);
		}
		int a = ary[0];
		int b = ary[1];
		int n = ary[2];

		int counter = 0;

		//System.out.println("Real prime numbers : " + Arrays.toString(ary));
		for (int i = 1; i <= n; i++) {
			if(i%a == 0 && i%b == 0)
				System.out.print("FB");
			else if (i%a == 0)
				System.out.print("F");        		
			else if (i%b == 0)
				System.out.print("B");
			else
				System.out.print(i);
			counter++;
			System.out.print(" ");
		}

	}
}
