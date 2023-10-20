package programs;

import java.util.Scanner;

public class Programeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Rows !");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
			
	}

}
