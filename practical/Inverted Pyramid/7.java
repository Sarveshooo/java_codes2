

import java.io.*;                                                                                                               
class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int rows = Integer.parseInt(br.readLine());

                for( int i = 1 ; i <= rows ; i++ ){

                        for( int j = 1 ; j < i ; j++ ){
                                System.out.print("\t");
                        }

			char ch = 'A';
                        for( int j = 1 ; j <= (rows-i)*2+1 ; j++ ){
                                if( j < rows-i+1 ){
					System.out.print( ch++ + "\t");
				} else {
					System.out.print( ch + "\t");
					ch--;
				}

                        }

                        System.out.println();
                }

        }

}
     
