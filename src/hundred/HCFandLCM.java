package hundred;

import java.util.Scanner;

public class HCFandLCM {

	public static void main(String[] args) {
	System.out.println("enter the numbers?");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		Scanner sd= new Scanner(System.in);
		int b=sc.nextInt();
		int hcf=1;
		int lcm;
		for(int i=1;i<a||i<b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		System.out.println("HCF OF A&B :"+hcf);
		lcm=a*b/hcf;
		System.out.println("LCM OF A&B:"+lcm);
		
	}
}
