import java.util.*;

class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
				System.out.print("\t");
			}
			for(int j=row;j>=i;j--){

			
				System.out.print(num+"\t");
				
				num=num+1;

			}num=num-1;
				System.out.println();
		}
	}
}
