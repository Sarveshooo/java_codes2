

import java.io.*;

class C2W  {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

		int num = 0 ;
                int col = 0 ;
                for( int i = 1 ; i < rows*2 ; i++ ){
                       
			if( i <= rows ){
                                col = i ;
				num = rows-i+1;
                        } else {
                                col-- ;
				num++ ;
                        }
                        for( int j = 1 ; j <= col ; j++ ){
                                System.out.print( num + "\t");
                        }
                        System.out.println();
                }

        }


}
