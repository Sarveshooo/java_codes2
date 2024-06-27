import java.util.* ;

class BNF2 {

        public static void main(String[] args) {
		
		 Scanner ganu = new Scanner(System.in);
 		 System.out.print("Enter number of rows : ");
 		 int rows = ganu.nextInt();

                for( int i = 1 ; i <= rows ; i++ ) {
                        int num = 1 ;
                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(num++ + " ");
                        }
                        System.out.println();
                }

        }

}
