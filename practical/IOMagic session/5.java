import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		System.out.println("Num="+ n);
		if(n%16==0){
			System.out.println(n+" is present in the table of 16");
		}else{
			System.out.println(n+" is not present in the table of 16");
		}

	}
}
