package programs;

import java.util.Scanner;

public class Programnine {

	public static void main(String[] args) {
		System.out.println("Enter the Rows !");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
			
	}

}
