
import java.util.*;
class Logic{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int f=n;
		System.out.print("Factors are:");
		while(f>0){
			if(n%f==0){
				System.out.print(f+" ");
			}f--;
		}


	
	}

}
