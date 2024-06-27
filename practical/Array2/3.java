import java.util.*;
class Arr{
	public static void main(String[] gs){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size:");
		int size=sc.nextInt();
		char arr[]=new char[size];
		char c=0;
		System.out.print("Enter characters:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextChar();
		}
		

		for(int i=0;i<size;i++){
			if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]='a' || arr[i]=='o' || arr[i]=='u' || arr[i]=='e' || arr[i]='i' ){
				System.out.print(arr[i]+" found at index "+i);
			
			}
		}
	
	}
}



