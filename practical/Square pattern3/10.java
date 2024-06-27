import java.util.*;
class Square{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int num=1;
		if(row%2==0){
		for(int i=1;i<=row;i++){
			int ch=64+row;
			for(int j=1;j<=row;j++){
				if(j%2==0){
				System.out.print((char)ch+" ");
				}else{
				if(num%2==1){
                                    System.out.print(num+" ");
				}else{
				System.out.print((char)ch+" ");
				}}ch--;
				num++;

			}System.out.println();
			num=num+1;
		}
		}else{
		for(int i=1;i<=row;i++){
			int ch=64+row;
			for(int j=1;j<=row;j++){
				if(num%2==1){
				System.out.print(num+" ");
				}else{
				System.out.print((char)ch+" ");
				ch--;
				}num++;

			}System.out.println();
		}
		}
	}

}
