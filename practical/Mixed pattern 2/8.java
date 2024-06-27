import java.util.*;

class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int n=row;
		for(int i=1;i<=row;i++){
			for(int j=row;j>i;j--){
				System.out.print("\t");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(n+"\t");
				n++;
			}n=n+i-1;
			
				System.out.println();
		}
	}
}
