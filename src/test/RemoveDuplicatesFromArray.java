package test;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[]= {2,6,1,8,1,5,3,10,12,11,3,6,8,12,2,1,3,10};
		int tempArr[]=new int[arr.length];
		removeDuplicates(arr,tempArr);

	}
	
	public static void removeDuplicates(int arr[], int tempArr[])
	{
		int j,k=0,count=0;
		Arrays.sort(arr);
		System.out.println("Array with duplicates after sorting:");
		for(int a:arr)
		{
		System.out.print(" " +a);
		}
		for(int i=0;i<arr.length-1;i++)
		{
		   j=i+1;
		   if(arr[i]!=arr[j])
		   {
			   tempArr[k]=arr[i];
			   k++;
			   count++;
		   }
		   else if(j==arr.length-1)
		   {
			   tempArr[k]=arr[j];
		   }
		}
		System.out.println("Array withOut duplicates");
		for(int i=0;i<count+1;i++)
		{
			System.out.print(" "+tempArr[i]);
		}
	}

}
