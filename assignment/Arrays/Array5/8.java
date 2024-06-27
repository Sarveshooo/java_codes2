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

		int min1 = arr[0];
		int min2 = arr[0];

		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

                for( int i = 0 ; i < arr.length ; i++ ){
                
			if( min1 > arr[i] ){
				min2 = min1 ;
				min1 = arr[i];
			} else if( min1 != arr[i] && min2 > arr[i]){
				min2 = arr[i];
			}
		}
                System.out.println( min2 + "\t\n--------------------------------------------------------------------------------------------------------------------------");

        }

}

