import java.util.*;

class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int n=1;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				if(i==4 && j==1){
					n=n+4;
				System.out.print(n+"\t");
				}else{
				System.out.print(n+"\t");
				n=n+2;
			}
			}
				System.out.println();
		}
	}
}
