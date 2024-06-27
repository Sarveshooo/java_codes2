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
		}int t=0;
		for(int i=0;i<s;i++){
			t=t+arr[i];
		}
		int a=1;
		a=t/s;
		System.out.println("Average of numbers:"+a);
	}
}
