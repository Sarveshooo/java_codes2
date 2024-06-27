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
		System.out.println("Element want to cheak:");
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<s;i++){
			if(n==arr[i]){
				c++;
			}}
		if(c>=2){
				System.out.print(n+"occures more than 1 in array");
			}

		
	
	}
}
