package patterns;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//space i
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<(2*n-1)-(2*i);j++) {
				System.out.print("*");
			}
			//space i
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
