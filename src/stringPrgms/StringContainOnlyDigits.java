package stringPrgms;

public class StringContainOnlyDigits {

	public static void main(String[] args) {
		String str="1a2345";
		int num=str.length();
		if(stringContainDigit(str,num))
		{
			System.out.println("String contains only digits");
		}
		else
		{
			System.out.println("No");
		}

	}
	
	public static boolean stringContainDigit(String str,int num)
	{
		
		for(int i=0;i<num;i++)
		{
		if(str.charAt(i)<'0'||str.charAt(i)>'9')
		{
			return false;
		}	
		
		}
		return true;
	}

}
