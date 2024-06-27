import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		System.out.println("Num="+ n);
		if(n>=18){
			System.out.println("Voter is Eligible");
		}else if(n<18 && n>0){
		
			System.out.println("Voter is Not Eligible");
		}else{
			System.out.println("Invalid age");
		}




	}
}
