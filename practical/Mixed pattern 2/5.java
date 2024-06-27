import java.util.*;

class Demo {
	public static void main(String[] s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
	
			for(int j=1;j<=row;j++){

			  if(i%2==0){
				System.out.print(num+"\t");
			  }else{
				System.out.print(num*num+"\t");
			  }

				num=num+1;

			}
				System.out.println();
		}
	}
}
