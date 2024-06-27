import java.util.*;
class Pattern{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No rows:");
		int r=sc.nextInt();
		
			int a=65;
		for(int i=1;i<=r;i++){
			
			for(int j=1;j<=i;j++){
				if(i%2==0){
				System.out.print((char)a+" ");
				
				}else{

				System.out.print(j+" ");
	
				}
				a++;
			}System.out.println();
		}
	}
}
