package stringPrgms;

public class ConvertNumericStringToNumber {

	public static void main(String[] args) {
		String str = "25";
		
        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
	}

}
