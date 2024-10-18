package javaPkg;

import java.util.Scanner;

public class Fibinoscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit, tempA=1,tempB=1,tempC=1;

		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number limit for the Fibinoscii series:");
		limit=in.nextInt();
		for(int i=0;i<limit;i++)
		{
			tempA=tempB;
			tempB=tempC;   // ************
			tempC=tempA+tempB;
			System.out.println(tempA+ " ");
		}
		
	}

}
