

import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                int col = 0 ;
                int space = 0 ;
		int num = 0 ; 
                for( int i = 1 ; i < rows * 2 ; i++ ){
                        if( i <= rows ){
                              space = rows - i ;
                              col = i * 2 - 1 ;
                              num =  rows - i + 1 ;
                        } else {
                              space = i - rows ;
                              col -= 2 ;
                              num++;
                        }

                        for( int sp = 1 ; sp <= space ; sp++ ){
                                System.out.print("\t")  ;
                        }
                        for( int j = 1 ; j <= col ; j++ ){
				System.out.print( num + "\t");
                        }
                        System.out.println();
                }

        }

}
