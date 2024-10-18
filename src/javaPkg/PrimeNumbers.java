package javaPkg;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, prime=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		number=in.nextInt();
//		for(int i=2;i<=number;i++)
//		{
		     for(int j=2;j<=5;j++)
		     {
			    if(number!=j && number%j==0)
			    {
			    	prime=0;
			    	break;
			    }

		     }
		     
		     if(prime==1)
		     {
		    	 System.out.println("The number is prime");
		     }
		     else
		     {
		    	 System.out.println("The number is not prime");
		     }
//		}

	}

}
