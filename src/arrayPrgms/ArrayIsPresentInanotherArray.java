package arrayPrgms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayIsPresentInanotherArray {

	public static void main(String[] args) {
		int arr[]= {1,4,7};
		int arr1[]={7,5,1,4,0,7};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					count++;
					break;
				}
			}
		}
		
		System.out.println(arr.length+" "+count);
		if(arr.length==count)
		{
			System.out.println("Array 1 is present in Array 2");			
		}
		else
			System.out.println("Array 1 is not present in Array 2");	
//		System.out.println(findArray(arr,arr1));
//		
//
//	}
//	
//	public static int findArray(int arr[],int arr1[])
//	{
//		return(Collections.indexOfSubList(Arrays.asList(arr), Arrays.asList(arr1)));
	}

}
