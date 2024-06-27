import java.util.*;
class Arr{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Size: ");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<s;i++){
			int rem=1;
			int va=0;
			int t=arr[i];
			c=0;
			while(arr[i]>0){
				rem=arr[i]%10;
				va=va*10+rem;
				arr[i]/=10;
				c++;
			}System.out.print(c+" ,");
		}
			
	}
}

