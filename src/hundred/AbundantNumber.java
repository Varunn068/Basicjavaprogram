package hundred;
import java.util.*;
public class AbundantNumber {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int fact=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			fact=fact+i;
		}
	}
	if(fact>a)
	{
		System.out.println("abundant!!!!");
	}
	else
	{
		System.out.println("not abudant");
	}
	}
}

//abundant number ? the factors of  the number 18 -1,2,3,6&9
//sum  of the  factor except the number greater than the  number is abundant number
//1+2+3+6+9=21>18