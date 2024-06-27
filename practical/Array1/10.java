import java.util.*;
class Arr{
	public static void main(String[] s){
		Scanner cs=new Scanner(System.in);
		System.out.print("Enter Size:");
		int size=cs.nextInt();
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
		
			System.out.println("Enter Exam seat no of "+i+" roll number student:");
			arr[i]=cs.next();
		}
		System.out.println("Output:");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Exam seat no of "+i+" roll number student is:"+arr[i]);
		}
	}
}
