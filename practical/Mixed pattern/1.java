
import java.util.*;
class Demo {
	public static void main(String[] s){
		int n=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
			for(int j=1;j<=r;j++){
				System.out.print(n+" ");
				n++;
			}System.out.println();
		}
	}
}

