package arrayPrgms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInAnIntegerArray {

	public static void main(String[] args) {
		int arr[]= {3,1,5,8,3,4,5,3};
		Set<Integer> duplicates= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					duplicates.add(arr[i]);
					//System.out.println(arr[i]);
			}
		}
		System.out.println("The duplicates are :"+duplicates);
		
		Integer[] dupArray= new Integer[duplicates.size()];
		duplicates.toArray(dupArray);
		System.out.print("The duplicates are :");
		for(int num:dupArray)
			System.out.print(" "+num+",");

	}

}
