package programs;

import java.util.Scanner;

public class programthree {

	public static void main(String[] args) {
		System.out.println("Enter the Rows !");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		for (int i=a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
		}	
	}

}
