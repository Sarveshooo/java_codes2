import java.util.*;
class Arr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		char arr[]=new char[s];
		System.out.println("Elements:");
		for(int i=0;i<s;i++){
			arr[i]=sc.next().charAt(0);
		}int count=0;
		int count1=0;
		for(int i=0;i<s;i++){
			if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='a' || arr[i]=='o' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				count++;
			}else{
				count1++;
			}
		}System.out.println("Count of vowels:"+count);
		System.out.println("Count of consonants:"+count1);
	}
}
