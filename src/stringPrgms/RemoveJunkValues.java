package stringPrgms;

public class RemoveJunkValues {

	public static void main(String[] args) {
		String str="^%$^%(28)**&!@@##its&#mylife^$^H^%$@RE#9$@*&*";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
//		String[] ch=str.split("#");
//		for(String c:ch)
//		{
//			System.out.print(c);
//		}
	}

}
