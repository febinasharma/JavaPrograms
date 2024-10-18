package javaPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeleteDuplicatesInAnArray {

	public static void main(String[] args) {
		
//************************************ USING ARRAY*********************************************************
	
		//1************************ SORT***********************
		
//		int arr[]={4,3,2,3,1,5,0,5,4,4,7};
//		int n= arr.length;
//		int temp[]=new int[n];
//		int j1=0;
//		int duplicateSize=0;
//		int temp1;
//		
//		for(int i=0;i<n-1;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			if(arr[i]>arr[j])
//			{
//				temp1=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp1;
//				
//			}
//		}
//		System.out.println("Sorted array is:");
//		for(int dis:arr)
//		{
//			System.out.println(dis);
//		}
			
// 2**************************REMOVE DUPLICATE FROM SORTED ARRAY*****************

//		for(int i=0;i<n-1;i++)
//			{
//			
//				if(arr[i]!=arr[i+1])
//				{
//					temp[j1]=arr[i];
//					j1++;
//						
//				}
//				else
//				{
//					duplicateSize++;    // store the number of duplicates
//				}
//			}
//		temp[j1]=arr[n-1];    // entering the last element present in arr array to temp array (cos that doesn't get stored in the above for loop)
//		System.out.println("No# of duplicates= "+duplicateSize);
//		System.out.println("After: ");
//		
//		for(int k=0;k<temp.length-duplicateSize;k++) // temp.length-duplicateSize reduces the number of duplicates from the actual array size
//		{
//		System.out.println(temp[k]);
//		}

// ************************************* USING ARRAY LIST*******************************************	
//		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(5,1,4,2,3,3,4,5));
//		System.out.println("Before: "+arr);
//		for(int i=0;i<arr.size();i++)
//		{
//			for(int j=0;j<arr.size();j++)
//			{
//				if(i!=j)
//				{
//				if(arr.get(i).equals(arr.get(j)))
//						{
//							arr.remove(j);
//						}
//				}
//			}
//		}
//		System.out.println("After: "+arr);
		
		
//***************************USING SET (convert array to a Set to delete duplicate and then convert set back to array**************************************
		
		int arr[]={4,3,2,3,1,5,0,5,4,4,7};
		int size=arr.length;
		
		Set<Integer> removeDuplicates=new HashSet<Integer>();
		for(int item:arr)
		{
			removeDuplicates.add(item);
		}
		System.out.println(removeDuplicates);  // Set contents displayed
		
		Integer[] arr1=new Integer[removeDuplicates.size()];
		removeDuplicates.toArray(arr1);  // Contents in removeDuplicates set is moved to array arr1
		for(int items:arr1)
		{
		System.out.println(items);
		}
		
		
		
	}
	
		

}
