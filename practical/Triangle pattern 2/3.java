import java.util.*;
class Pattern{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No rows:");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
			int a=64+r;
			for(int j=1;j<=i;j++){
				System.out.print((char)a+" ");
				a--;
			}System.out.println();
		}
	}
}
