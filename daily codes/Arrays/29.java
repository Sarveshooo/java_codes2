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
			System.out.println("Enter Arr Element:");
			arr[i]=sc.nextInt();
		}
			System.out.println(" Elements");
		for(int i=1;i<arr.length;i++){

			System.out.println(arr[i]);
		}
		int s=0;
		for(int i=1;i<arr.length;i++){


		s=s+arr[i];

	
	}
			System.out.println("Sum:"+s);
}
}
		
