import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<s;i++){
			if(arr[i]<0){
			System.out.print(arr[i]*arr[i]+" ");
			}else{
			System.out.print(arr[i]+" ");
			}

		}
		
	}
}
