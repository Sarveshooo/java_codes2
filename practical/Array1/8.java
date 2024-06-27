import java.util.*;
class Arr{
	public static void main(String[] s){
		Scanner cs=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=cs.nextInt();
		int arr[]=new int[size];
		int c=0;
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter age of "+i+"Employee:");
			arr[i]=cs.nextInt();
		}
		System.out.println("Output:");
		for(int i=0;i<size;i++)
		{
			c=c+i;
			
		}
			System.out.println("Total employees are:"+size);
	}
}
