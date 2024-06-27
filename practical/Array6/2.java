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

		int sum = 0 ; 
		int count1 = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
                
			int count2 = 0;
			for( int j = 1 ; j <= arr[i]/2 ; j++ ){
				if( arr[i] % j == 0 ){
					count2++ ;
				}
			}
				if( count2 == 1 ){
					sum += arr[i];
					count1++;
				}
		}
                System.out.println("\n Sum of all prime numbers is " + sum + " and count of prime numbers in the given array is " + count1);
 
        }

}
