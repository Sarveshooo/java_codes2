

import java.util.*;

class Demo {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[]{144,169,196,225,256};

		System.out.println("Size of array is : " + arr.length); 
                for( int i = 0 ; i < arr.length ; i++ ){
                
			if( arr.length <= 5 &&  arr.length % 2 == 1 ){
				if( arr[i] % 2 == 1 ){
					System.out.print(arr[i] + "\t");
				}
			} else {
				if( arr[i] % 2 == 0 ){
					System.out.print(arr[i] + "\t");
				}
			}		
		}
		System.out.println();

        }

}
