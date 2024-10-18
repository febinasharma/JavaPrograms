package javaPrgm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=in.nextInt();
		System.out.println("Number is :"+num);
		if(prime(num))
			System.out.println("The number "+num+" is Prime");
		else
			System.out.println("The number "+num+" is Not Prime");
}
	
	private static boolean prime(int num)
	{
		if(num>3||num==1)
			{
			if(num%2==0||num%3==0||num==1)
				return false;
					
			}
		return true;			
		
	}

}
