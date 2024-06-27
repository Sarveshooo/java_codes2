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
		System.out.print("Even numbers:");

		for(int i=0;i<size;i++){
			if(arr[i]%3==0){
				System.out.print(arr[i]+" ");
				c=c+arr[i];
			}
		}
		System.out.println();
		System.out.println("sum of numbers divisible by 3 is:"+c);
	}
}



