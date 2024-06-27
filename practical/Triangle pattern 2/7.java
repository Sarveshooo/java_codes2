import java.util.*;
class Pattern{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No rows:");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++){
			int a=95+i;
			for(int j=1;j<=i;j++){
				if(j%2==0){
				System.out.print((char)a+" ");
				a++;
				}else{

				System.out.print(i+" ");
	
				}
			}System.out.println();
		}
	}
}
