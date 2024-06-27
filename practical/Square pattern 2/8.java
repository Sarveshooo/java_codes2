import java.util.*;
class Square{
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		int num=row;
		int c=97+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==1){
					
					System.out.print(num*num-1+" ");
					
				}else{
					System.out.print((char)c+" ");
			
					
				}}else{
					System.out.print((char)c+" ");
					
					
				
				}num++;c++;
			}System.out.println();
		}
	}
}

