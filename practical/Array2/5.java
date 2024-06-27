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
		System.out.print("Numbers:");

		for(int i=0;i<size;i++){
			if(i%2==1){
				System.out.print(arr[i]+" ");
				c=c+arr[i];
			}
		}System.out.println();
		System.out.println("Sum of odd index numbers are:"+c);
	}
}



