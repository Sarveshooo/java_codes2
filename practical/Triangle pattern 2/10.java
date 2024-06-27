import java.util.*;
class Pattern{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No rows:");
		int r=sc.nextInt();
		int a=1;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
			int b=96+a;
				if(i%2==0){
				System.out.print((char)b+" ");
	
				}else{

				System.out.print(a+" ");
	
				}a++;
			}System.out.println();
		}
	}
}
