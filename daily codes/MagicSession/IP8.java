
import java.util.*;

class Yash8 {

	public static void main(String[] args) {

		Scanner ganu = new Scanner(System.in);
		System.out.print("Enter your num1 : ");
		int num1 = ganu.nextInt();

		System.out.print("Enter your num2 : ");
                int num2 = ganu.nextInt();

		int sum = 0 ;

		for( int i = num1 ; i <= num2 ; i++ ) {
			sum += i ;
		}
		System.out.println(sum);
	}

}

