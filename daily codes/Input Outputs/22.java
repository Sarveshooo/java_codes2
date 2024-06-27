
import java.io.*;

class IO{
	public static void main(String[] args)throws IOException{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		String x=b.readLine();
		System.out.println("Name :"+x);
		String y=b.readLine();
		System.out.println("Company Name:"+y);
	}
}
