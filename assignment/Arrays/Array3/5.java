

import java.util.*;

class Demo {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                int arr[] = new int[]{-2,5,-6,7,-3,8};

                for( int i = 0 ; i < arr.length ; i++ ){
                
			if( arr[i] < 0 ){
				arr[i] = arr[i]*arr[i];
				System.out.print(arr[i] + "\t");
			} else {
				System.out.print(arr[i] + "\t");
			}

		}
		System.out.println();
        }

}
