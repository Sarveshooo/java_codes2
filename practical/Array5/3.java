import java.util.*;
class Arr{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements: ");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<s/2;i++){
			if(arr[i]!=arr[s-i-1]){
				flag=1;
				break;
		}
		}
		if(flag==0){
			System.out.println("Array is Palindrome");
		}else{
			System.out.println("Array is not Palindrome");
		}
	}
}

