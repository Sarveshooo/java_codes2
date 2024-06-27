
// Merge Two Arrays of different length 

import java.io.*;

class Demo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[size1];
                int size2 = Integer.parseInt(br.readLine());
                int arr2[] = new int[size2];

                System.out.println("Enter Elements in arr1 ");
                for( int i = 0 ; i < arr1.length ; i++ ){
                        arr1[i] = Integer.parseInt(br.readLine());
                }

                System.out.println("Enter Elements in arr2 ");
                for( int i = 0 ; i < arr2.length ; i++ ){
                        arr2[i] = Integer.parseInt(br.readLine());
                }

                System.out.println();
		
		 int size3 = arr1.length + arr2.length ;
                 System.out.println(size3);
                 int arr3[] = new int[size3];
                 System.out.println();

                 for( int i = 0 ; i < arr1.length ; i++ ){
                         arr3[i] = arr1[i];
                         System.out.print(arr3[i] + "\t");
                 }

                 int num = 0 ;
                 for( int i = arr1.length ; i < size3 ; i++ ){
                         arr3[i] = arr2[num];
                         num++;
                         System.out.print(arr3[i] + "\t");
                 }
		 System.out.println();

        }

}

