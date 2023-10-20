package hundred;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean isprime=true;
		if(a<2)
		{
			isprime=false;
		}
		else
		{
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					isprime=false;
				}
			}
		}
		String result=isprime?"Prime":"not Prime";
		System.out.println(result);
	}
}
