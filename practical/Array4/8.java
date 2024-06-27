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
		System.out.println("Enter character want to cheak:");
	
		int a=sc.next().charAt(0);
		for(int i=0;i<s;i++){
			if(a==arr[i]){
				count++;
			}
		}
	System.out.println(a+" occures "+count+" times in array");
	}
	
}
