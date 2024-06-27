import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}

		if(s%2==1 && s>=5){
		for(int i=0;i<s;i++){
			if(arr[i]%2==1){

			System.out.print(arr[i]+" ");
			}			}
		}else{
		for(int i=0;i<s;i++){
			if(arr[i]%2==0){

			System.out.print(arr[i]+" ");
			}	}		}
		
	}
}
