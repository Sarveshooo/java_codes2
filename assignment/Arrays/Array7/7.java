

import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows :  ");
                int rows = Integer.parseInt(br.readLine());
                System.out.print("Enter Column : ");
                int col = Integer.parseInt(br.readLine());

                int arr[][] = new int[rows][col];

                for(int i = 0 ; i < arr.length ; i++ ){
                        for( int j = 0 ; j < arr[i].length ; j++ ){
                                arr[i][j] = Integer.parseInt(br.readLine());
                        }
                        System.out.println();
                }

		int prod = 1 ; 
                for(int i = 0 ; i < arr.length ; i++ ){
                        for( int j = 0 ; j < arr[i].length ; j++ ){
                                if(arr[i] == arr[j] ){
					prod *= arr[i][j] ;
				}
                        }
		}
                System.out.println("Product of primary Diagonal :" + prod );

        }

}
