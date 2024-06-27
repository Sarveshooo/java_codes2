import java.util.*;

class BNF7 {

        public static void main(String[] args) {

               	Scanner ganu = new Scanner(System.in);
                 System.out.print("Enter number of rows : ");
                 int rows = ganu.nextInt();

                for( int i = 1 ; i <= rows ; i++ ) {

                        char ch = 'd' ;
                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(ch-- +" ");
                        }
                        System.out.println();
                }

        }

}
