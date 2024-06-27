
import java.util.*;

class Yash10 {

	public static void main(String[] args) {

		Scanner ganu = new Scanner(System.in);
		System.out.print("Math : ");
		int math = ganu.nextInt();

		System.out.print("Science : ");
                int science = ganu.nextInt();

		System.out.print("English : ");
                int english = ganu.nextInt();

		System.out.print("Marathi : ");
                int marathi = ganu.nextInt();

		int sum = math + science + english + marathi ;
		System.out.println( sum  + " out of 400." );
	}

}

