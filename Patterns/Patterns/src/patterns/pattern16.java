package patterns;

import java.util.Scanner;

public class pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int n = sc.nextInt();
		
		for(char i=65;i<65+n;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}
