import java.util.*;


class Yash1 {

	public static void main(String[] args) {

		Scanner ganu = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = ganu.nextInt();

		if( num % 2 == 0 ) {
			System.out.println( num + " is an Even Number ." );
		} else {
			System.out.println( num + " is an Odd Number .");
		}

	}

}


