package maths;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		int N = n;
		int rem = 0,rev = 0;
		while(n>0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if(N == rev) {
		System.out.println("Palindrome");		
		}else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}
}
