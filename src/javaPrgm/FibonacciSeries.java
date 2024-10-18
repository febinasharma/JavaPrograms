package javaPrgm;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		limit=in.nextInt();
		fibonacci(limit);
		
	}
	
	public static void fibonacci(int limit)
	{
		int tempA=0,tempB=1,tempC=1;
		
		for(int i=0;i<limit;i++)
		{
			System.out.println(" "+tempA);
			tempA=tempB;
			tempB=tempC;
			tempC=tempA+tempB;			
			
		}
	}

}
