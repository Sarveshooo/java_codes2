/*
 Que 1 : Missing number in array
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to
N. Find the missing element.

Example 1:

Input:
N = 6

A[] = {1,2,4,5,6}

Output: 3

Example 2:

Input:
N = 11

A[] = {1,3,2,5,6,7,8,11,10,4}

Output: 9

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106
*/
import java.io.*;

class Demp {

	public static void main(String[] args )throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size : ");
		int size  = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		
		for( int i = 0 ; i < arr.length ; i++ ){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int sum1 = 0 ;
		for( int i = 0 ; i < arr.length ; i++ ){
			sum1 += arr[i];
		}
		int sum2 = 0 ;
		for( int i = 1 ; i <= size ; i++ ){
			sum2 += i ;
		}
		int num = sum2-sum1 ;
		System.out.println("The missing number is :" + num);
	}

}













