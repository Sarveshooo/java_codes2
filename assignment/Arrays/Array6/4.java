import java.io.*;

class Demo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];
		int arr2[] = new int[size];

		System.out.println("Enter Elements in arr1 ");
                for( int i = 0 ; i < arr1.length ; i++ ){
                        arr1[i] = Integer.parseInt(br.readLine());
                }
		
		System.out.println("Enter Elements in arr2 ");
                for( int i = 0 ; i < arr1.length ; i++ ){
                        arr2[i] = Integer.parseInt(br.readLine());
                }

                
		System.out.println();
		for( int i = 0 ; i < arr1.length ; i++ ){
			for(int j = 0 ; j < size ; j++ ){
				if( arr1[i] == arr2[j] ){
					System.out.print( arr1[i] + " \t ");
					break;
				}
			}
                }
                System.out.println();

        }

}

