import java.util.*;
class Arr{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter element: ");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}

		int a=0;
		int b=0;
		for(int i=0;i<s;i++){
			if(arr[i]%2==0){
				a=a+arr[i];
			}else{
				b=b+arr[i];
			}
		}
		System.out.println("Odd sum: "+b);
		System.out.println("Even sum: "+a);
	
	}
}

