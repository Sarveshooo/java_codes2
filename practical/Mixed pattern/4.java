
import java.util.*;
class Demo{
	public static void main(String[] s){
		int n=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
		n=r;
int b=r;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n+" "); 
				n++;
			}System.out.println();
				n=n-i-1;
		}
	}
}
