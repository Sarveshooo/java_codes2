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

		int max1 = 0 ;
		int max2 = 0 ;
		int max3 = 0 ;

                for( int i = 0 ; i < arr.length ; i++ ){
                
			if( max1 < arr[i] ){
				max3 = max2 ;
				max2 = max1 ;
				max1 = arr[i];
			} else if( max1 != arr[i] && max2 < arr[i] ){
				max3 = max2 ;
				max2 = arr[i];
			} else {
				max3 = arr[i];
			}
		}
                System.out.println("The third largest element is " + max3);

        }

}
