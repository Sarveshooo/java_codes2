import java.util.*;
class Square{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int ch=64+row;
		int ch1=96+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
					System.out.print((char)ch+" ");
				}else{
					System.out.print((char)ch1+" ");
				}ch++;ch1++;
			}System.out.println();
		}
	}
}

