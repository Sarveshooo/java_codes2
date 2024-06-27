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

		int p=1;
		System.out.println("composite numbers are:");
		for(int i=0;i<s;i++){
		int t=1;
		int c=0; 
			while(arr[i]>=t){
				if(arr[i]%t==0){
				c++;
		
				}
			t++;

	
		}if(c>2){
	
			System.out.println(arr[i]+",");

		}
	}	
	
}
}
