
import java.io.*;

class C2W {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = Integer.parseInt(br.readLine());
                }

		int count = 0 ;
                for( int i = 1 ; i < arr.length ; i++ ){
                
			if( arr[i-1] >= arr[i]){
				count++;
			} 
		}
		if( count == 0 ){
			System.out.println("Array is in ascending order ");
		} else {
			System.out.println("Array is not in ascending order ");
		}

        }

}

