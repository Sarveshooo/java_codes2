
import java.io.*;
class Jagg{
	public static void main(String[] S)throws IOException{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter arr size:");
		int size=Integer.parseInt(sc.readLine());
		int arr[]=new int[size];
		System.out.println("Enter arr Elements:");
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(sc.readLine());
		}
		System.out.println("Elements:");
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}
