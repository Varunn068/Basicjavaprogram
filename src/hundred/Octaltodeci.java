package hundred;

import java.util.Scanner;

public class Octaltodeci {
	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		int a= sc.nextInt();
		int oct=0;
		int n=0;
		while(a!=0) {
		int d=a%10;
		oct+=d*Math.pow(8, n);
		a/=10;
		n++;
		}

		System.out.println(oct);	

	}

}
