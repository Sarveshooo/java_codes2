import java.util.*;
class Square{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of Rows:");
		int row=sc.nextInt();
		int n=row;
		int ch=64+row;
		int ch1=96+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j<n){
					System.out.print((char)ch1+" ");
				}else{
					System.out.print((char)ch+" ");
				}ch++;ch1++;
			}System.out.println();n--;
		}
	}
}

