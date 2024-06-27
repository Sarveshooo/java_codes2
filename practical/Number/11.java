
import java.util.*;
class Logic{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int rem=1;
		int va=0;
		int t=n;
		while(n>0){
		rem=n%10;
		va=va*10+rem;
		n/=10;
		}if(va==t){
			System.out.println(t+ " is palindrome num");
		}else{
			System.out.println(t+ " is not palindrome num");

		}
	
	}

}
