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

		int count =  0 ; 
                for( int i = 0 ; i < arr.length ; i++ ){
              
			int temp = arr[i];
			int rem = 0 ;
			int var1 = 0 ;
			while( temp != 0 ){
				rem = temp % 10 ;
				var1 = var1 * 10 + rem ;
				temp /= 10 ;
			}
			if( var1 == arr[i] ){
				count++;
			}

	       	}
                System.out.println("\n" + "Count of the pallindrome number is " + count);

        }

}
