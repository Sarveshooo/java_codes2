import java.util.*;
class Arr{
	public static void main(String[] s){
		Scanner cs=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=cs.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=cs.nextInt();
		}
		System.out.println("Output:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
