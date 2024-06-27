
import java.io.*;
class Demo{
	public static void main(String[] s)throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of Rows :");
		int row=Integer.parseInt(b.readLine());
		for(int i=1;i<=row;i++){
			int n=1;
			for(int j=1;j<=i;j++){
				System.out.print(n+" ");
				n++;
			}
				System.out.println();
		}
	}
}



