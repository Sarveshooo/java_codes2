import java.util.*;
class Square{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int ch=64+row;
			int n=row;
			for(int j=1;j<=row;j++){
				if(i%2==1){
				System.out.print((char)ch+" ");
				ch--;
				}else{
				System.out.print(n+" ");
				}
			}System.out.println();
		}
	}

}
