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
		System.out.println("Numbers:");

		for(int i=0;i<size;i++){
		
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter element you want to search");
		int a=sc.nextInt();
		for(int i=0;i<size;i++){
			if(a==arr[i])
				System.out.println(arr[i]+" is found at index "+i);
		}
	}
}



