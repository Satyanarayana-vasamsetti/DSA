package maths;

import java.util.Scanner;

public class reverseInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int n = sc.nextInt();
		int rem = 0,rev=0,sign=1;
		if(n<0) {
			sign=-1;
			n=-n;
		}
		
		while(n>0) {
				rem = n%10;
				rev = rev*10+rem;
				n=n/10;
				
			}
		rev = rev * sign;
		System.out.println(rev);
		sc.close();
	}
}
