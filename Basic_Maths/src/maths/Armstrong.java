package maths;

import java.util.Scanner;

public class Armstrong {
	public static int armstrong(int x) {
		int rem = 0,sum = 0,rev = 0;
		while(x > 0) {
			rem = x % 10;
			rev = rev * 10 + rem;
			sum+=rev;
			x = x / 10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int x =sc.nextInt();
		System.out.println(armstrong(x));
		sc.close();
		
	}
}
