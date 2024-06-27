
import java.io.*;
class Demo{
	public static void main(String[] s)throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of Rows :");
		int row=Integer.parseInt(b.readLine());
		int n=row+64;
		for(int i=1;i<=row;i++){
		 n=row+64;
			for(int j=row;j>=i;j--){
				System.out.print((char)n+" ");
				n--;
			}
				System.out.println();
		}
	}
}



