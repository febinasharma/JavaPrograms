package arrayPrgms;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
	int count=0,j=0,k=0,i=0;
	int arr[]= {5,3,7,12,11,4,5,3,7,2,4,5};
	int temp[]=new int[arr.length];
	Arrays.sort(arr);
	
	for(i=0;i<arr.length-1;i++)
	{
		j=i+1;
		if(arr[i]!=arr[j])
		{
			temp[k]=arr[i];
			k++;
		}
		else
			count++;
	}
	temp[k]=arr[i];
	count=arr.length-count;
	for(i=0;i<count;i++)
	{
		System.out.print(temp[i]+" ");
	}

	}

}
