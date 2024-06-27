import java.util.*;
class Space{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		
			int a=row;
			a=64+row;
			int b=64+row;
		for(int i=row;i>=1;i--){
				
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print((char)a+" ");
				a++;
			}
			a=64+row;
				System.out.println();
		}
	}
}


