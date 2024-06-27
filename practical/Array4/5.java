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
		
		for(int i=0;i<s;i++){
		int rem=1;
		int va=0;
		int t=arr[i];
			while(arr[i]>0){
				rem=arr[i]%10;
				va=va*10+rem;
				arr[i]/=10;
			}System.out.println(va);
		}
			
	}
}
