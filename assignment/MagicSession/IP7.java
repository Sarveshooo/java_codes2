

import java.util.*;

class Yash7 {

	public static void main(String[] args) {

		Scanner ganu = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num = ganu.nextInt();

		for( int i = 10 ; i >= 1 ; i-- ) {
			System.out.print( num * i + " " );
		}
		System.out.println();
	}

}

