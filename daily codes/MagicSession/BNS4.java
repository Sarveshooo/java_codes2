import java.util.*;

class BNF4 {

        public static void main(String[] args) {
		
		 Scanner ganu = new Scanner(System.in);
                 System.out.print("Enter number of rows : ");
                 int rows = ganu.nextInt();
                 char ch = 'A';

                for( int i = 1 ; i <= rows ; i++ ) {
                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(ch + " ");
                                ch += 2;
                        }
                        System.out.println();
                }

        }

}
