
import java.util.*;
class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
	
		for(int i=1;i<=r;i++){
		int c=64+r;
		int n=1;
			for(int j=1;j<=r;j++){
				if(i%2==1){

				System.out.print((char)c+" ");
				c--;
				}else{
				System.out.print(n+" ");
				n++;
				}
			}System.out.println();
		}
	}
}

