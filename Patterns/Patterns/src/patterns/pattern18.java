package patterns;

import java.util.Scanner;

public class pattern18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		for(int i=69;i>=n;i--) {
			for(char j=69;j>=i;j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		sc.close();
	}
}
