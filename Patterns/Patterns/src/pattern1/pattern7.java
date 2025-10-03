package pattern1;

import java.util.Scanner;

public class pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//space (n-i-1)
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			//space (n-i-1)
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		sc.close();
	}
}
