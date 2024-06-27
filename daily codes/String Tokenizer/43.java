import java.util.*;
class ST{
	public static void main(String[] gs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player info");
		String info=sc.nextLine();
		StringTokenizer s=new StringTokenizer(info," ");
		String str1=s.nextToken();
		String str2=s.nextToken();
		String str3=s.nextToken();
		String str4=s.nextToken();
		
		System.out.println("Player  Nane:"+str1);
		System.out.println("JersiNo:"+str2);
		System.out.println("Avg:"+str3);
		System.out.println("Grade"+str4);

	}
}


