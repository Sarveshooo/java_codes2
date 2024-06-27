
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

		int sumEve = 0 ;
		int sumOdd = 0 ;

                for( int i = 0 ; i < arr.length ; i++ ){
                
			if( arr[i] % 2 == 0 ){
				sumEve += arr[i];
			} else {
				sumOdd += arr[i];
			}
		}     
		System.out.println("Sum of Even Numbers is : " + sumEve);
		System.out.println("Sum of Odd Numbers is : " + sumOdd);
																		   
																		    		}
																		    }

