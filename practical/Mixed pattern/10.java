import java.util.*;
class Demo{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		long n=sc.nextLong();
		long v=0;
		long rem=1;
		long t=n;
		while(n>0){
			rem=n%10;
			if(rem%2==1){
				System.out.print(rem*rem+",");
			}
			v=v*10+rem;
			n/=10;
		}System.out.println(v+" is reverse number of"+t);
	}
}
