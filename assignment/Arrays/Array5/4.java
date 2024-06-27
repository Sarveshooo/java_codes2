import java.io.*;

class iqoo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = Integer.parseInt(br.readLine());
                }

		int count = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){

			for( int j = 1 ; j < arr.length ; j++ ){
				int temp = arr[i];
				if( temp == arr[i] && arr[i] != arr[j]){

					System.out.println("First duplicate element present in Array at index " + i );
					count++;
					break;
				} 

			}
			System.out.println();
	        }
                System.out.println();

        }

}
