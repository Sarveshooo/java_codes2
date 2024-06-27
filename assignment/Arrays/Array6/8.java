import java.io.*;

class Demo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                char arr[] = new char[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = (char)br.read();
			br.skip(1);
                }

		for( int i = arr.length-1 ; i >= 0 ; i-- ){
			System.out.print(arr[i] + "\t");
		}
	
                System.out.println();

        }

}
