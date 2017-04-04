import java.util.Scanner;

public class WeaselOrNot {
		public static void main( String[] args) {
			Scanner keyboard = new Scanner (System.in);
			String word;
			boolean yep, nope;
			System.out.println("please type in \"weasel\" please.");
			word=keyboard.next();
			yep="weasel".equals(word);
			nope = !word.equals("weasel");
			
			System.out.println(yep);
			System.out.println(nope);
			
	
			}
}
