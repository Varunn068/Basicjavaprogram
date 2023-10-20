package hundred;

public class Harshad {

	public static void main(String[] args) {
		int a=21;
		int rem=0;
		int fact=0;
		while(a!=0)
		{
		 int d=a%10;
		 fact=fact+d;
		 a/=10;
		}
     
		if(a%fact==0)
		{
			System.out.println("harshadNumber");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
	}

}

//harshad number:21=(2+1)=3
//21/3=7;
