package stringPrgms;

import java.util.Arrays;

public class StringToByteArray {

	public static void main(String[] args) {
		String str="FEBINA";
		byte[] byteArray=str.getBytes();
		System.out.println(Arrays.toString(byteArray));
		
		byte byteAr[]= {70, 69, 66, 73, 78, 65};
		String str1=new String(byteAr);
		System.out.println(str1);

	}

}
