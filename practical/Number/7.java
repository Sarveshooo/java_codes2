
import java.util.*;
class Logic{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int f=1;
		int t=n;
		while(n>0){
			f=f*n;
			n--;
		}System.out.println(f+" is factorial of num "+t);
	

	
	}

}
