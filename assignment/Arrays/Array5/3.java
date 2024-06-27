import java.io.*;

class iqoo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];
		int arr2[] = new int[size];

                for( int i = 0 ; i < arr1.length ; i++ ){
                        arr1[i] = Integer.parseInt(br.readLine());
                }

                for( int i = 0 ; i < arr1.length/2 ; i++ ){
			arr1[arr1.length-i-1] = arr2[i];
		}
		
		int count =  0 ;
		for( int i = 0 ; i < arr1.length ; i++ ){
			if( arr1[i] != arr2[i]){
				break;
			} else {
				count++;
			}
		}
		if( count == 0 ){
			System.out.println("Array is a Pallindrome ");
		} else {
			System.out.println("Array is not a Pallindrome");
		}

        }

}
