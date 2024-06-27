
import java.util.*;
class Demo{
	public static void main(String[] s){
		int n=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
			
			for(int j=r;j>=i;j--){
				System.out.print(n+"\t");
				n=n+2;
			}System.out.println();
		
		}
	}
}

