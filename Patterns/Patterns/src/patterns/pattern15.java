package patterns;

import java.util.Scanner;

public class pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(char j=65;j<70-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
