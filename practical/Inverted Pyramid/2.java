

import java.io.*;                                                                                                               
class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

		int num = 1 ; 
                for( int i = 1 ; i <= rows ; i++ ){

                        for( int j = 1 ; j < i ; j++ ){
                                System.out.print("\t");
                        }

                        for( int j = 1 ; j <= (rows-i)*2+1 ; j++ ){
                                System.out.print( num++ + "\t" );
                        }

                        System.out.println();
                }

        }

}
     
