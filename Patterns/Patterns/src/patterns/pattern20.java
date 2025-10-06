package patterns;

import java.util.Scanner;

public class pattern20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//star (n-i)
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			//space
			for(int j=1;j<=2*n-2-2*i;j++) {
				System.out.print(" ");
			}
			//star (n-i)
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			//star (n-i)
			for(int j=1;j<n-i;j++) {
				System.out.print("*");
			}
			//space
			for(int j=1;j<=2*i+2;j++) {
				System.out.print(" ");
			}
			//star (n-i)
			for(int j=1;j<n-i;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
		sc.close();
	}
}
