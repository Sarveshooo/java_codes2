import java.io.*;

class iqoo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                for( int i = 0 ; i < size ; i++ ){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                for( int i = 0 ; i < arr.length ; i++ ){
            
			int count =  0;
			for( int j = 0 ; 0 != arr[i] ; j++){
				count++;
				arr[i] /= 10 ;
			}
			System.out.print(count+ "\t");

	/*		int count = 0 ;
			int j = arr[i];
			while( j != 0 ){
				count++;
				j /= 10 ;
			}
			System.out.print(count+ "\t");
				
*/
		}
                System.out.println();

        }

}
