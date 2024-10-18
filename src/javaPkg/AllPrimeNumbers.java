package javaPkg;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		int upperLimit;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		upperLimit=in.nextInt();
		for(int i=2;i<=upperLimit;i++)
		{
			if(isPrime(i,upperLimit))
			{
				System.out.println(" "+i);
		     }
		}	     
	}
	
	public static boolean isPrime(int currentNumber, int limit)
	{
		for(int j=2;j<=limit/2;j++)
	     {
		    if(currentNumber!=j && currentNumber%j==0)
		    {
		    	return false;
		    }

	     }
		return true;
	}

}
