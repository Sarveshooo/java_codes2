import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                System.out.print("Enter Rows :");
                int rows = Integer.parseInt(br.readLine());

                for( int i = 1 ; i <= rows ; i++ ){
                        for( int sp = 1 ; sp <= rows-i ; sp++ ){                                                                                    
                                System.out.print("\t");                                                                                                                     
                        int num = 1 ;
			for( int j = 1 ; j <= i*2-1 ; j++ ){
                                          
				System.out.print( num + "\t");                                                                                                                    
                        System.out.println();
                        }
                }
        }
}
}
