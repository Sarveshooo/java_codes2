

import java.util.*;

class Demo {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[]{1,4,5,6,11,9,10};

		int prod = 1 ;
                for( int i = 0 ; i < arr.length ; i++ ){
                
			int count = 0 ;
			for( int j = 1 ; j <= arr[i] ; j++ ){
				if( arr[i] % j == 0 ){
					count++ ;
				}
			}
			if( count == 2 ){
				prod *= arr[i];
			}	
		}
		System.out.println(prod);
        }

}
