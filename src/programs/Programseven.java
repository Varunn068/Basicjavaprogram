package programs;

import java.util.Scanner;

public class Programseven {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            int spaces = 2 * (rows - i);
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Move to the next line
	        }
	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            int spaces = 2 * (rows - i);
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // Move to the next line
	        }
	        sc.close();
	}

}
