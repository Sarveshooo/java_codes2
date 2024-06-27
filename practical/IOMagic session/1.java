import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		System.out.println("Num="+ n);
		if(n%2==0){
			System.out.println(n +" is even");
		}else{
			System.out.println(n +" is odd");
		}

	}
}
