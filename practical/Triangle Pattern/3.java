
import java.io.*;
class Demo{
	public static void main(String[] s)throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of Rows :");
		int row=Integer.parseInt(b.readLine());
		int a=65;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)a+" ");
				a++;
			}a=a+row-i-2;
			
				System.out.println();
		}
	}
}



