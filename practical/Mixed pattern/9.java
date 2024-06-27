
import java.util.*;
class Demo{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++){
			int a=r+62-i+3;
		 	int n=1;
			for(int j=r;j>=i;j--){
				if(i%2==0){
				System.out.print((char)a+" ");
				a--;
				}else{
				System.out.print(n+" ");
				n++;}
			}System.out.println();
			n=i+1;
		}
	}
}

