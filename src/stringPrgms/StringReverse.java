package stringPrgms;

public class StringReverse {
	

		public static void main(String args[])
		{
		String res="";
		String str="reverse";
		for(int i=str.length()-1;i>=0;i--)
		{
		res+=str.charAt(i);
		}

		System.out.println(res);
		}
		

}
