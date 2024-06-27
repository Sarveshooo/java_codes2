
import java.util.*;

class Yash5 {

	public static void main(String[] args) {

		Scanner ganu = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = ganu.nextInt();

		if( num % 16 == 0 ) {
			System.out.println( num + " is present in the table of 16.");
		} else {
			System.out.println( num + " is not present in the table of 16.");
		}

	}

}
