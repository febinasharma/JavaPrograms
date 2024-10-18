package stringPrgms;

public class RemoveDuplicateWordsFromASentance {

	public static void main(String[] args) {
		
		String str="This is Java and a java code with java";
		String strsplit[]=str.split(" ");
		String strnew=" ";
		System.out.println(strsplit.length);
		
		for(int i=0;i<strsplit.length-1;i++)
		{
			int j=0;
			for(j=0;j<i;j++)
			{
				if(strsplit[i].equalsIgnoreCase(strsplit[j]))
						{
							break;
						}
			}
			if(i==j)
			{
				strnew+=strsplit[i]+" ";
			}
				
			
		}
		
		System.out.println(strnew);

	}

}
