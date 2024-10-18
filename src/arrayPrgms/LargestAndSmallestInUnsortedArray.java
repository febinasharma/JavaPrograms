package arrayPrgms;

public class LargestAndSmallestInUnsortedArray {

	public static void main(String[] args) {
		int arr[]= {7,4,12,5,6,7,30,22,7,13,9,4,31};
		int large=0,small=0;
		
		int i=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				large=j;
				i=j;
			}
		}
		
		i=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				small=j;
				i=j;
			}
		}

		System.out.println(arr[large]);
		System.out.println(arr[small]);
	}

}
