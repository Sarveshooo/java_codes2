import java.util.*;

class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
	
		for(int i=1;i<=row;i++){
		int ch1=96+i;
		int ch=64+i;
			for(int j=1;j<=i;j++){
				System.out.print("\t");
			}
			for(int j=row;j>=i;j--){

				if(row%2==0){
				System.out.print((char)ch1+"\t");
				
				ch1=ch1+1;
			}else{
				System.out.print((char)ch+"\t");
	
				ch=ch+1;
			}
			}
				System.out.println();
		}
	}
}
