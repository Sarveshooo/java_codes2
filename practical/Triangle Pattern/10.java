
import java.io.*;
class Demo{
	public static void main(String[] s)throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of Rows :");
		int row=Integer.parseInt(b.readLine());
		int n=65;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				if(n%2==0){

				System.out.print((char)n+" ");
				}else{
					System.out.print(n+" ");
				}
				n++;
			}n=n-row+i;
				System.out.println();
		}
	}
}



