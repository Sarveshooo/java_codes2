import java.util.* ;

class Demo {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Specific number : ");
                int num = sc.nextInt();

                int arr[] = new int[]{2,5,2,8,7,2};

                int count = 0 ;
                for( int i = 0 ; i < arr.length ; i++ ){
                        if( num == arr[i]){
                                count++;
			}
		}

                if( count > 0 ){
                                System.out.println("Number " + num + "  occured " + count + " in array");
                } else {
                                System.out.println("Number " + num + " not found in array  ");
		}	

	}

}

   
