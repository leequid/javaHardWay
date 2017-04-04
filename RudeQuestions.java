import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income;
		int faveNum;
		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		System.out.print( "What is your favorite number between 1~10" );
		faveNum = keyboard.nextInt();
		System.out.print( "My favorite number is "+ faveNum + " too.!!" );
		
	}
}