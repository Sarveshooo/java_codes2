import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows :");
		int rows = Integer.parseInt(br.readLine());

		for( int i = 1 ; i <= rows ; i++ ){
			for( int sp = 1 ; sp <= rows-i ; sp++ ){
				System.out.print("\t");
			}
			int num = rows-i+1;
			char ch = (char)(num+64);
			for( int j = 1 ; j <= i*2-1 ; j++ ){
				if( j < i ){
					System.out.print(ch++ + "\t");
				} else {
					System.out.print(ch-- + "\t");
				}

			}
			System.out.println();
		}

	}

}

