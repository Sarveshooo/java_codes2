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

                for( int i = 0 ; i < arr.length ; i++ ){
      			if( arr[i] > 64 && arr[i] < 91 ){
				System.out.print((char)(arr[i]) + "\t");
			} else {
				System.out.print( arr[i] + "\t");
			}
      		}
                System.out.println();

        }

}
