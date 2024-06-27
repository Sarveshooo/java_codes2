



import java.util.*;


class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int rows = sc.nextInt();

		System.out.print("Enter Columns : ");
		int colms = sc.nextInt();
		
		int arr[][] = new int[rows][colms];
	
		for( int i = 0 ; i < arr.length ; i++ ){
			for( int j = 0 ; j < arr[i].length ; j++ ){
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}

	
		//int arr[][] = new int[][]{{10,20,30,40,50},{60,70,80,90,11},{12,13,14,15,16},{17,18,19,21,22},{31,32,33,34,35}};

		for( int i = 0 ; i < arr.length ; i++ ){
			for( int j = 0 ; j < arr[i].length ; j++ ){
				if( i == j || j == arr.length-i-1 ){
					System.out.print( arr[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
			System.out.println();
		}

	}

}

