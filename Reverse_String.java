import java.util.*;

public class Reverse_String {

	private static Scanner in;

	public static void main(String args[])
	   {
	      String original, reverse = "";
	      in = new Scanner(System.in);
	 
	      System.out.println("ENTER THE STRING");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("REVERSE ORDER OF THE STRING IS: "+reverse);
	   }
}
