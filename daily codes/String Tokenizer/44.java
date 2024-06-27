import java.util.*;
class ST{
	public static void main(String[] gs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player info");
		String info=sc.nextLine();
		StringTokenizer st=new StringTokenizer(info,",");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		

	}
}


