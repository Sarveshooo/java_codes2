import java.util.* ;

class Demo {

        public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Specific number : ");
		int num = sc.nextInt();

                int arr[] = new int[]{1,5,9,8,7,6};

		int count = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
			if( num == arr[i]){
				count++;
				System.out.println("Number " + num + " found at index " + i );
				break;
			}
		}
		if( count == 0 ){
				System.out.println("Number " + num + "  not found  in array");
		}
			

	}

}

