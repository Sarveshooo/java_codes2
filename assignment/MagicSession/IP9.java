
import java.util.*;

class Yash9 {

	public static void main(String[] args) {

		Scanner ganu = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int num1 = ganu.nextInt();

		System.out.print("Enter Num2 : ");
		int num2 = ganu.nextInt();

		for( int i = num1 ; i <= num2 ; i++ ) {
			if( i % 2 == 0 ) {
				System.out.print( i + " " );
			}
			System.out.println();
		}
	
	}

}


