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

		int max2=arr[0];
		int max=arr[0];
		for(int i=0;i<s-1;i++){
			if(arr[i]<max){
			max=arr[i];	
			max2=max;
			}else if(arr[i]<max2){
			max2=arr[i];	
			}
		}

			System.out.println("2nd minimum element:"+max2);
	}
}

