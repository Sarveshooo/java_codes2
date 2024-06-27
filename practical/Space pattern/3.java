import java.util.*;
class Space{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int b=1;
			int a=67;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
	
			for(int j=1;j<=i;j++){
				System.out.print((char)a+" ");
				a++;
			}a=a-row-i+2;
	
				System.out.println();
		}
	}
}


