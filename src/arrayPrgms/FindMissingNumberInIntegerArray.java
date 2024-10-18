package arrayPrgms;

import java.util.Arrays;

public class FindMissingNumberInIntegerArray {

	public static void main(String[] args) {
		int arr[]= {7,5,6,1,4,2};
		 int n=arr.length+1;
	        int sum=n*(n+1)/2;
	        System.out.println(sum);
	        int restSum=0;
	        for (int i = 0; i < arr.length; i++) {
	            restSum+=arr[i];
	        }
	        int missingNumber=sum-restSum;
	        System.out.println(missingNumber); 

	}

}
