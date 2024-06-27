

import java.util.*;

class Demo {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[]{4,5,7,9,10};

		for( int i = 0 ; i < arr.length ; i++ ){
			 int count = 0 ;

			 for( int j = 1 ; j <= arr[i] ; j++ ){
				 if( arr[i] % j == 0 ){
                                 count++ ;
                       		 }
			 }
			 if( count != 2 ){
				 System.out.print(arr[i] + "\t");
			 }
		}
		System.out.println();
	}
}
