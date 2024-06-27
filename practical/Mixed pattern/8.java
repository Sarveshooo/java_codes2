
import java.util.*;
class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
		int n=r*(r-1)+64;
		if(r==4){
			n=n-2;
		}
		for(int i=1;i<=r;i++){
			
			for(int j=r;j>=i;j--){
				System.out.print((char)n+"  ");
				n--;
			}System.out.println();
		
		}
	}
}

