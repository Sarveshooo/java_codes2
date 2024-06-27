import java.util.*;
class Arr{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<s-1;i++){
		int f=1;
			for(int j=1;j<arr[i];j++){
				f=f*j;
			}
		System.out.println(f);
	}
			
	}
}

