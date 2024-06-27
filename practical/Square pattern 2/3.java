import java.util.*;
class Square{
	public static void main(String [] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int num=row;
		int ch=96+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				
				 if(num%2==0){
					System.out.print(num+" ");
				}else{
					System.out.print((char)ch+" ");
				}ch++;num++;
			}System.out.println();
		}
	}
}

