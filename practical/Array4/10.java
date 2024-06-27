import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		char arr[]=new char[s];
		System.out.println("Characters:");
		for(int i=0;i<s;i++){
			arr[i]=sc.next().charAt(0);
		}int count=0;
		System.out.println("Enter character key:");
	
		int a=sc.next().charAt(0);
		for(int i=0;i!=a;i++){
		System.out.println(arr[i]);
		}
	}
	
}
