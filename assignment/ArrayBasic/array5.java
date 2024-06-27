/*
 
5] Replace all 0's with 5

You are given an integer N. You need to convert all zeros of N to 5.

Example 1:
Input:
N = 1004
Output: 1554

Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".

Example 2:
Input:
N = 121
Output: 121

Explanation: Since there are no zeroes in
"121", the number remains as "121".

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
*/


import java.util.*;

class Demo {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();

		int arr[] =  new int[size];
		
		for( int i = 0 ; i < arr.length ; i++ ){
		
			arr[i] = sc.nextInt();
		}
		
		int count = 0 ;
		System.out.println();
		for( int i = 0 ; i < arr.length ; i++ ){
		
			if( arr[i] == 0 ){
			
				arr[i] = 5 ;
				count++;
			}
			System.out.print(arr[i]+ "  ");

		}

			System.out.println();
			//if( count <= 0 ){
			
			//	System.out.println("There is no 0");
			//}
		


	}
}
