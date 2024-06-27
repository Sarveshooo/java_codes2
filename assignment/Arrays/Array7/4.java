


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

                for(int i = 0 ; i < arr.length ; i++ ){
                        int sum = 0 ;
                        for( int j = 0 ; j < arr[i].length ; j++ ){
					sum += arr[i][j];
                        }
                        if( i % 2 == 0 ){
				System.out.println("Sum of row " + (i+1) + " = " + sum );
			}
                }

        }

}
