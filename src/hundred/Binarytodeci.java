package hundred;

import java.util.Scanner;

public class Binarytodeci {
	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		int a= sc.nextInt();
		int deci=0;
		int n=0;
		while(a!=0) {
		int d=a%10;
		deci+=d*Math.pow(2, n);
		a/=10;
		n++;
		}

		System.out.println(deci);
	}

}
