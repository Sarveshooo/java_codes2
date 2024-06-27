import java.util.*;
class OneDA{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr Size:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Size:"+arr.length);
		for(int i=1;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
	}
}

		
