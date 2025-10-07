package maths;

import java.util.Scanner;

public class countNdigits {
	//brute force approach
	public static int countDigit(int n) {
		int cnt = 0;
		while(n>0) {
			cnt+=1;
			n=n/10;
		}
		return cnt;
	}
	
	//optimal approach
	public static int countD(int n) {
		int cnt = (int) (Math.log10(n)+1);
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number ");
		int n = sc.nextInt();
		countDigit(n);
		countD(n);
		System.out.println("The number "+n+" has "+countDigit(n)+" digits");
		System.out.println("The number "+n+" has "+countD(n)+" digits");
		sc.close();
	}
}
