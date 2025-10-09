package maths;

import java.util.Scanner;

public class GCD {
	public static int Gcd(int a,int b) {
		while(a > 0 && b > 0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		}
		if(a==0) 
			return b;
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a =sc.nextInt();
		System.out.print("Enter second number:");
		int b =sc.nextInt();
		System.out.println("GCD of "+ a +" and "+ b + " is "+Gcd(a,b));
		sc.close();
	}
	
}
