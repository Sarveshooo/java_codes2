import java.util.*;
class Space{
	public static void main(String[] S){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows:");
		int row=sc.nextInt();
		
			int a=row;
			a=65 ;
			int b=1;
		for(int i=row;i>=1;i--){
				
			for(int j=row;j>=i;j--){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				if(j%2==1){
					System.out.print((char)a+" ");
				}else{
					System.out.print(a+" ");
				}
				a++;
			}
			a=65+b;
			b++;
				System.out.println();
		}
	}
}


