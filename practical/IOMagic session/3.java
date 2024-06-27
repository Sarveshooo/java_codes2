import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		System.out.println("Num="+ n);
		if(n%8==0){
			System.out.println(n + " is Divisible by 8");
		}else{
			System.out.println(n + " is Not Divisible by 8");
		}
	}
}
