import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		int flag=0;
		int c=0;
		int b=0;
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Specific Elements:");
		int n=sc.nextInt();
		for(int i=0;i<s;i++){
			if(n==arr[i]){
				c++;
		
		        }else{
				flag=0;

			}
		}if(c>0){
				System.out.println(n+" is occured "+c+" times ");
		}else{
				System.out.println(n+" is not found");
		}
	}
}
