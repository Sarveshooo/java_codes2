
import java.util.*;
class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++){
			int a=r+96;
		 	int n=r;
			for(int j=1;j<=i;j++){
				if(i%2==1){
				System.out.print((char)a+" ");
				a--;
				}else{
				System.out.print(n+" ");
				n--;}
			}System.out.println();
			n=i+1;
		}
	}
}

