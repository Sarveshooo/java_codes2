

import java.util.*;

class Demo {

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                char arr[] = new char[]{'a','b','c','d','e','f','i','y','o','p','A','B','I','O','Y','Z'};

                for( int i = 0 ; i < arr.length ; i++ ){
			if( arr[i] == 'a' || arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u' ||arr[i] == 'A' ||arr[i] == 'E' ||arr[i] == 'I' ||arr[i] == 'O' ||arr[i] == 'U' ){
			}else {
				System.out.print(arr[i] + "\t");
			}
             }
	     System.out.println();

        }

}
