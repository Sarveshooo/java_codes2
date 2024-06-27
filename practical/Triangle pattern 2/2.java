import java.util.*;
class Pattern{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No rows:");
		int r=sc.nextInt();
	
		for(int i=1;i<=r;i++){
		char a='a';
			for(int j=1;j<=i;j++){
				if(i%2==0){
				System.out.print("$ ");
				}else{

				System.out.print(a+" ");
				a++;
				}
			}System.out.println();
		}
	}
}
