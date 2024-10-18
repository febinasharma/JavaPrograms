package arrayPrgms;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicatesInAnArray {

	public static void main(String[] args) {

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
