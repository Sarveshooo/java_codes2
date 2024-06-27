import java.util.*;
class Square{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print(j*2+" ");
					}else{
						System.out.print(j*3+" ");}
				}else{
					if(j%2==0){
						System.out.print(j*2+" ");
					}else{
						System.out.print(j*3+" ");}
				
				}
			}System.out.println();
		}
	}

}
