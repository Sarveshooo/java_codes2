import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark:");
		int n1=sc.nextInt();
		System.out.println("math="+ n1);
		int n2=sc.nextInt();
	      	System.out.println("sci="+ n2);
		int n3=sc.nextInt();
		System.out.println("his="+ n2);
		int n4=sc.nextInt();
		System.out.println("sans="+ n2);
		if(n1>=1 && n1<=100 && n2>=1 && n2<=100 && n3<=100 && n3>=1 && n4<=100 && n4>=1){
			int total=1;
			total=n1+n2+n3+n4;
			System.out.println("Total marks are: "+total);
		}else{
			System.out.println("Enter Invalid Marks ");
		}
	}
}
