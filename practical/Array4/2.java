import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];

		for(int i=0;i<s;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int a=0;
		a=max-min;
		System.out.println("Average of numbers:"+a);
	}
}
