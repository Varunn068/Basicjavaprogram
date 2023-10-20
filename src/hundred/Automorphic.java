package hundred;

public class Automorphic {

	public static void main(String[] args) {
	 
		int a=5;
		int b=(int) Math.pow(a, 2);
		int c=a%10;
		int d=b%10;
		
		if(c==d)
		{
			System.out.println("Automorphic!!!");
		}
		else
		{
			System.out.println("Not Automorphic!!!");
		}
	}
}


