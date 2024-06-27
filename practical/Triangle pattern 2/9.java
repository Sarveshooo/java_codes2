import java.util.*;
class Pattern{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No rows:");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++){
			int a=95+i;
			int b=96+i;
			for(int j=1;j<=i;j++){
				if(j==2){
				System.out.print((char)a+" ");
				}else if(j==4){
				System.out.print((char)b+" ");
				
				
				}else{

				System.out.print(r+j+" ");
	
				}
			}System.out.println();
		}
	}
}
