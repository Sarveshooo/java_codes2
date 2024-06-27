

import java.util.*;

class Demo {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[]{1,2,3,12,15,6,7,10,9};

		int oddNum = 0 ;
		int eveNum = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
                
			if( arr[i] % 2 == 0 ){
				arr[i] = 0 ;
				System.out.print( arr[i] + "\t");
			} else { 
				arr[i] = 1 ;
				System.out.print( arr[i] + "\t");
			}
		}
		System.out.println();

        }

}
