import java.util.*;
class Arr{
	public static void main(String[] gs){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int c=0;
		System.out.print("Enter numbers:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers:");

		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
				c=c+1;
			}
		}
		System.out.println("count of even numbers are:"+c);
	}
}



