import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		System.out.println("Num="+ n);
		int n1=1;
		for(int i=10;i>=1;i--){
			n1=n*i;
			System.out.print(n1+",");
		}
	}
}
