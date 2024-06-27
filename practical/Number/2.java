
import java.util.*;
class Logic{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int t=1;int count=0;
		while(t<=n){
			if(n%t==0){
				count++;
			}
			t++;
		}if(count==2){
			System.out.println(n+"is prime number");
		}else{
			System.out.println(n+"is not prime number");
		}

	
	}

}
