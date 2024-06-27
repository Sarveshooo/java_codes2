import java.io.*;

class iqoo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a Number : ");
		int num = Integer.parseInt(br.readLine());
		
		System.out.println("\n");

		int temp = num ;
		int rem1 = 0 ;
		int var1 = 0 ;
		int count1 = 0 ;

		while( temp != 0 ){
			rem1 = temp % 10 ;
			count1++;
			var1 = rem1 + var1 * 10 ;
			temp /= 10 ;
		}
		int arr[] = new int[count1];

	/*	int rem2 = 0 ;
		for( int j = arr.length-i-1 ; j > 0 ; j-- ){
		       rem2 = var1 % 10 ;
		       arr[i] = rem2 + 1 ; 
		       var1 /= 10 ;
		}
	*/
		int num2 = 0 ;
		int rem2 = 0 ;
		while( var1 != 0 ){
			rem2 = var1 % 10 ;
			arr[num2] = rem2 + 1 ;
			num2++;
			var1 /= 10 ;
		}

		for( int i = 0 ; i < arr.length ; i++ ){
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");
        }

}

