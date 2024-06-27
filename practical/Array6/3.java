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

		System.out.print("\n Enter the Key : ");
		int key  = Integer.parseInt(br.readLine());

		int count = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
  			
			if( key == arr[i] ){
				count++;
			}
		}
		if( count > 2 ){
			for( int i = 0 ; i < arr.length ; i++ ){
			       if( arr[i] == key ){
			       	arr[i] = arr[i] * arr[i] * arr[i] ;
				System.out.print( arr[i] + "\t");
			       }
			}
		} else {
			if( count < 2 && count > 0 ){
				System.out.println("Element not found in array . ");
			}
		}
		System.out.println();

        }

}
