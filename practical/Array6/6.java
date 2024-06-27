
import java.io.*;

class Demo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                System.out.print("Enter key : ");
                int key = Integer.parseInt(br.readLine());
                
		for( int i = 1 ; i <= 1 ; i++ ){
               		for( int j = 0 ; j < arr.length ; j++ ){
				if(arr[j] % key == 0 ){
				       System.out.println("An element of multiple of " + key + " is found at index " + j );
				}
			}		
	       	}
                System.out.println();

        }

}
