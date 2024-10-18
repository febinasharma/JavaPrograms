package test;

public class RemoveMultipleSpaces {

	public static void main(String[] args) {
		String str="  uty6586  686jhghgf   ";
		System.out.println(str.replaceAll("\\s+"," ").trim());

	}

}
