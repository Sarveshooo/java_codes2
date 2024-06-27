import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		System.out.println("Num="+ n);
			int nn=1;
		for(int i=1;i<=10;i++){
			nn=n*i;
			System.out.print(nn + ",");
		
		}
	}
}
