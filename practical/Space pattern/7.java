import java.util.*;
class Space{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		
			
		for(int i=row;i>=1;i--){
			int a=1;
			
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(a+" ");
			a++;
			}
				System.out.println();
		}
	}
}


