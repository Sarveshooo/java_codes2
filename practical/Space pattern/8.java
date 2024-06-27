import java.util.*;
class Space{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		
			int a=row;
			a=1;
			int b=1;
		for(int i=row;i>=1;i--){
				
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(a+" ");
				a++;
			}b++;
			a=b;
				System.out.println();
		}
	}
}


